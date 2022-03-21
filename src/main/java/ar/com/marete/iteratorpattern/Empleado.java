package ar.com.marete.iteratorpattern;

public class Empleado {
    private String nombre;
    private String division;

    public Empleado(String nombre, String division) {
        this.nombre = nombre;
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
