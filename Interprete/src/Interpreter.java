import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        MyLanguageLexer lexer;
        if (args.length>0)
            lexer = new MyLanguageLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new MyLanguageLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(tokens);
        ParseTree tree = parser.commands();

        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }
}
