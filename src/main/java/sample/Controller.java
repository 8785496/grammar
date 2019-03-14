package main.java.sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML private BorderPane ap;
    @FXML private TextArea editor;

    @FXML
    private void menuClose() {
        Platform.exit();
    }

    @FXML
    private void menuOpenFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Открыть файл");
        Stage stage = (Stage)ap.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        if (file == null) {
            System.out.println("file not choose");
            return;
        }
        System.out.println(file.toString());
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
}
