package ar.com.marete.templatemethodpattern;

public class Empleado extends Persona{

    public String legajo;

    public Empleado(String legajo) {
        this.legajo = legajo;
    }


    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    protected String getIdentificacion() {
        return String.valueOf(legajo);
    }

    @Override
    protected String getTipoId() {
        return "numero de legajo";
    }
}
