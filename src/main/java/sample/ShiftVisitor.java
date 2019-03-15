// Generated from Shift.g4 by ANTLR 4.7.1
package main.java.sample;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShiftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShiftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShiftParser#statementseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementseq(ShiftParser.StatementseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ShiftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftParser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftexpression(ShiftParser.ShiftexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ShiftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ShiftParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShiftParser#identifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifer(ShiftParser.IdentiferContext ctx);
}