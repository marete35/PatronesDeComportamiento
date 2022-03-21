package ar.com.marete.iteratorpattern;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Empleado> {

    private Empleado[] empleado;
    private int location = 0;

    public DivisionIterator(Empleado[] empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean hasNext() {
        if(location < empleado.length && empleado[location] != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Empleado next() {
        return empleado[location++];
    }
}
