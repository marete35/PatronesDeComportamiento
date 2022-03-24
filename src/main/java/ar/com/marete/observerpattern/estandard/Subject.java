package ar.com.marete.observerpattern.estandard;

public interface Subject {

    public void attach(ILibroMalEstado observador);
    public void  dettach(ILibroMalEstado observador);
    public void notifyObservers();
}
