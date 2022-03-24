package ar.com.marete.observerpattern.estandard;

/**
 * Y, por ultimo, la clase que avisa que ocurrio un evento determinado.
 */
public class Biblioteca {

    public void devuelveLibro(Libro libro){
        if("MALO".equals(libro.getEstado())){
            AlarmaLibro a = new AlarmaLibro();
            a.notifyObservers();
        }
    }
}
