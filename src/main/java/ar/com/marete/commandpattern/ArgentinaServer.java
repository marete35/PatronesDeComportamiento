package ar.com.marete.commandpattern;

public class ArgentinaServer implements IServer{

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Argentina");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de Argentina");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Argentina");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Comprando la conexion de Argentina");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar log de Argentina");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("Cerrando conexion con el servidor de Argentina");
    }
}
