package ar.com.marete.commandpattern;

public class ApagarServer implements Command{

    private IServer servidor;

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.apagate();
        servidor.cerrarConexion();
    }
}
