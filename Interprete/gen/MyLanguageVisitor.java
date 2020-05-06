// Generated from /home/sebastian/IdeaProjects/Interprete/grammar/MyLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MyLanguageParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MyLanguageParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#else_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cond(MyLanguageParser.Else_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(MyLanguageParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#printexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintexpr(MyLanguageParser.PrintexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#whilecmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilecmd(MyLanguageParser.WhilecmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MyLanguageParser.BooleanExprContext ctx);
}