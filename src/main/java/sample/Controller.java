package main.java.sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.readFileToString;
import static org.apache.commons.io.FileUtils.writeStringToFile;

public class Controller {
    @FXML private BorderPane ap;
    @FXML private TextArea editor;
    @FXML private TextArea out;
    private File openedFile = null;
    private static final String encoding = "UTF-8";

    @FXML
    private void menuClose() {
        Platform.exit();
    }

    @FXML
    private void menuNew() {
        editor.setText("");
        out.setText("");
        openedFile = null;
    }

    @FXML
    private void menuOpenFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Открыть файл");
        Stage stage = (Stage)ap.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        if (file == null) {
            return;
        }
        try {
            String text = readFileToString(file, encoding);
            openedFile = file;
            editor.setText(text);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void menuSave() {
        if (openedFile == null) {
            menuSaveAs();
            return;
        }
        try {
            writeStringToFile(openedFile, editor.getText(), encoding);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void menuSaveAs() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Сохранить файл");
        Stage stage = (Stage)ap.getScene().getWindow();
        File file = fileChooser.showSaveDialog(stage);
        if (file == null) {
            return;
        }
        try {
            writeStringToFile(file, editor.getText(), encoding);
            openedFile = file;
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    private void menuCopy() {
        editor.copy();
    }

    @FXML
    private void menuPaste() {
        editor.paste();
    }

    @FXML
    private void menuCut() {
        editor.cut();
    }

    @FXML
    private void menuUndo() {
        editor.undo();
    }

    @FXML
    private void menuAnalyze() {
        out.setText("");
        String text = editor.getText();
        if (text == null || text.length() == 0) {
            return;
        }
        CharStream charStream = CharStreams.fromString(text);
        ShiftLexer shiftLexer = new ShiftLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(shiftLexer);
        ShiftParser shiftParser = new ShiftParser(commonTokenStream);
        ParseTree parseTree = shiftParser.statementseq();
        out.setText(parseTree.toStringTree(shiftParser));
    }
}
