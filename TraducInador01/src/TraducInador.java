import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;
import java.util.*;
public class TraducInador<T> extends exrpBaseVisitor<T>{
    Stack th = new Stack();
    @Override
    public T visitI(exrpParser.IContext ctx) {
        System.out.println((String)(visitE(ctx.e())));
        return visitE(ctx.e());
    }


    @Override
    public T visitE(exrpParser.EContext ctx) {
        th.push(visitT(ctx.t()));
        return visitEp(ctx.ep());
    }

    @Override
    public T visitT(exrpParser.TContext ctx) {
        if (ctx.ID() != null){
            return (T)(ctx.ID().toString());
        }
        return visitE(ctx.e());
    }

    @Override public T visitEp(exrpParser.EpContext ctx) {
        if (ctx.OP() != null){
            String op = ctx.OP().get(0).getText();
            T Ttrad = visitT(ctx.t(0));
            String opTrad;
            opTrad = "mult";
            if (op.equals("+"))
                opTrad = "suma";
            if (op.equals("-"))
                opTrad = "resta";
            th.push(opTrad + "(" + th.pop() + "," + Ttrad + ")");
            return visitEp(ctx.ep(0));
        } else
            return (T)th.pop();
    }
}