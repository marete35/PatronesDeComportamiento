package ar.com.marete.observerpattern.estandard;

import java.util.ArrayList;

/**
 * Ahora realizaremos la clase que notifica a los observadores.
 */
public class AlarmaLibro implements Subject{

    private static ArrayList<ILibroMalEstado> observadores = new ArrayList<>();

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i < observadores.size(); i++){
            ILibroMalEstado observador = observadores.get(i);
            observador.update();
        }
    }
}
