package ar.com.marete.chainofresponsabilitypattern;

public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitudPrestamo(56000);
    }
}
