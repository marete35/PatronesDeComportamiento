package ar.com.marete.iteratorpattern;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        Division d = new Division("Mi sucursal");
        d.add("Empleado1");
        d.add("Empleado2");

        Iterator<Empleado> iter = d.iterator();
        while (iter.hasNext()){
            Empleado e = iter.next();
            e.toString();
        }
    }
}
