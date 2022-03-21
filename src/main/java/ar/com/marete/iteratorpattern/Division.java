package ar.com.marete.iteratorpattern;

public class Division {

    private Empleado[] empleados = new Empleado[100];
    private int numero = 0;
    private String nombreDivision;

    public Division(String n){
        this.nombreDivision = n;
    }

    public String getName(){
        return this.nombreDivision;
    }

    public void add(String nombre){
        Empleado e = new Empleado(nombre, nombreDivision);
        empleados[numero++] = e;
    }

    public DivisionIterator iterator(){
        return new DivisionIterator(empleados);
    }
}
