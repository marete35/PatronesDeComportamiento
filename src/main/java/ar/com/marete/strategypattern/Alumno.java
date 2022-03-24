package ar.com.marete.strategypattern;

public class Alumno {
    private String nombre;
    private double promedio;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
