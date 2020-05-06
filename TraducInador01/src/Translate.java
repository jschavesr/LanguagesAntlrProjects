import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Translate {
    public static void main(String[]args) throws Exception{
        exrpLexer lexer ;
        if (args.length>0)
            lexer = new exrpLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new exrpLexer(CharStreams.fromStream((System.in)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        exrpParser parser = new exrpParser(tokens);
        ParseTree tree = parser.i();
        TraducInador<String> traducinador = new TraducInador<>();
        traducinador.visit(tree);

    }
}