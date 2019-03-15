package main.java.sample;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

class PrintShiftVisitor extends ShiftBaseVisitor<String> {
    @Override
    public String visitStatementseq(ShiftParser.StatementseqContext ctx) {
        return indent(ctx.depth()) + "Statementseq" + "\n"
                + visitChildren(ctx);
    }

    @Override
    public String visitStatement(ShiftParser.StatementContext ctx) {
        String result = indent(ctx.depth()) + "Statement";
        if (ctx.getChildCount() > 1) {
            result = result + "\n" + visit(ctx.getChild(0));
        }
        return result + "\n" + indent(ctx.depth() + 1) + ";";
    }

    @Override
    public String visitShiftexpression(ShiftParser.ShiftexpressionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(ctx.depth())).append("Shiftexpression");
        int length = ctx.getChildCount();
        for (int i = 0; i < length; i++) {
            sb.append("\n").append(indent(ctx.depth() + 1)).append(visit(ctx.getChild(i)));
        }
        return sb.toString();
    }

    @Override
    public String visitExpression(ShiftParser.ExpressionContext ctx) {
        return "Expression" + "\n" + visitChildren(ctx);
    }

    @Override
    public String visitLiteral(ShiftParser.LiteralContext ctx) {
        return indent(ctx.depth()) + "Literal" + "\n"
                + indent(ctx.depth() + 1) + visitChildren(ctx);
    }

    @Override
    public String visitIdentifer(ShiftParser.IdentiferContext ctx) {
        return indent(ctx.depth()) + "Identifer" + "\n"
                + indent(ctx.depth() + 1) + visitChildren(ctx);
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        return "Error";
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.toString();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }

    private String indent(int depth) {
        int length = (depth - 1) * 4;
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = ' ';
        }
        return new String(arr);
    }
}

