import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador lexico que se alimenta a partir de la entrada (archivo  o consola)
            exrpLexer lexer;
            if (args.length>0)
                lexer = new exrpLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new exrpLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador lexico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el analizador sintactico que se alimenta a partir del buffer de tokens
            exrpParser parser = new exrpParser(tokens);
            ParseTree tree = parser.e(); // comienza el analisis en la regla inicial
            System.out.println(tree.toStringTree(parser)); // imprime el arbol en forma textual
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}