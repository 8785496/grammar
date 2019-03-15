package main.java.sample;
// Generated from Shift.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShiftParser}.
 */
public interface ShiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShiftParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(ShiftParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(ShiftParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ShiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ShiftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(ShiftParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(ShiftParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ShiftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ShiftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ShiftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ShiftParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShiftParser#identifer}.
	 * @param ctx the parse tree
	 */
	void enterIdentifer(ShiftParser.IdentiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShiftParser#identifer}.
	 * @param ctx the parse tree
	 */
	void exitIdentifer(ShiftParser.IdentiferContext ctx);
}