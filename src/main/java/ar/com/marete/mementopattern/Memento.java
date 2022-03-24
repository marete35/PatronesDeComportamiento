package ar.com.marete.mementopattern;

/**
 * Vamos a realizar un ejemplo de este patron donde se busque salvar el nombre de una persona que puede variar
 * a lo largo del tiempo.
 */
public class Memento {

    private String estado;

    public Memento(String estado){
        this.estado = estado;
    }

    public String getSavedState(){
        return estado;
    }
}
