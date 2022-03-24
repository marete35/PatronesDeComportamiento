package ar.com.marete.statepattern;

public class Persona {

    private String nombre;
    private ISaludState salud;

    public Persona(){
        salud = new Saludable();
    }

    public void estoyBien(){
        salud = new Saludable();
    }

    public void dolorDeCabeza(){
        salud = new DolorDeCabeza();
    }

    public void dolorDePanza(){
        salud = new DolorDeCabeza();
    }

    public String comoTeSentis(){
        return salud.comoTeSentis();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ISaludState getSalud() {
        return salud;
    }

    public void setSalud(ISaludState salud) {
        this.salud = salud;
    }
}
