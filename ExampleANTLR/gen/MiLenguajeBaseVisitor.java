// Generated from /home/sebastian/IdeaProjects/ExampleANTLR/grammar/MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link MiLenguajeVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MiLenguajeBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MiLenguajeVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInicio(MiLenguajeParser.InicioContext ctx) { return visitChildren(ctx); }
}