// Generated from /home/sebastian/IdeaProjects/TraductorSimple/grammar/Ejercicio1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ejercicio1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ejercicio1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ejercicio1Parser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(Ejercicio1Parser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio1Parser#ep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEp(Ejercicio1Parser.EpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ejercicio1Parser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(Ejercicio1Parser.TContext ctx);
}