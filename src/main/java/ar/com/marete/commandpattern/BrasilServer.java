package ar.com.marete.commandpattern;

public class BrasilServer implements IServer{

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Brasil");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de Brasil");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Brasil");
    }

    @Override
    public void verificaConexion() {
        System.out.println("Comprobando la conexion de Brasil");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardando los logs de Brasil");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("Cerrando la conexion con Brasil");
    }
}
