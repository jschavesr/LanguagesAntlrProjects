// Generated from /home/sebastian/IdeaProjects/TraducInador01/grammar/exrp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exrpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exrpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exrpParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(exrpParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link exrpParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(exrpParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link exrpParser#ep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEp(exrpParser.EpContext ctx);
	/**
	 * Visit a parse tree produced by {@link exrpParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(exrpParser.TContext ctx);
}