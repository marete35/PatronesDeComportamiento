package ar.com.marete.interpreterpattern;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        String romano = "LXI";
        Context context = new Context(romano);

        //Construimos el arbol
        ArrayList<Expression> tree = new ArrayList<>();
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        //Lo interpretamos.
        for(Expression exp: tree){
            System.out.println("Evaluamos la expresion: "+exp.getClass().getSimpleName());
            exp.interpreter(context);
        }
        System.out.println(context.output);
    }
}
