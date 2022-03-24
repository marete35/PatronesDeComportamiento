package ar.com.marete.observerpattern.estandard;

public class Administracion implements ILibroMalEstado{
    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envio una queja formal...");
    }
}
