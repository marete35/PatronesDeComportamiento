package ar.com.marete.observerpattern.estandard;

/**
 * Vamos a suponer un ejemplo de una Biblioteca, donde cada vez que un lector devuelve un libro
 * se ejecuta el metodo devuelveLibro(Libro libro) de la clase Biblioteca.
 *
 * Si el lector devolvio el libro dañado entonces la aplicacion avisa a ciertas clases que estan interesadas
 * en conocer este evento.
 *
 * La interfaz ILibroMalEstado debe ser implementada por todos los observadores.
 */
public class App {

    public static void main(String[] args) {
        AlarmaLibro a = new AlarmaLibro();
        a.attach(new Compras());
        a.attach(new Administracion());
        a.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");

        Biblioteca b = new Biblioteca();
        b.devuelveLibro(libro);
    }
}
