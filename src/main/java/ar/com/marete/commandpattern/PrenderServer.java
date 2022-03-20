package ar.com.marete.commandpattern;

public class PrenderServer implements Command {
    private IServer servidor;

    public PrenderServer(IServer servidor){
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.prendete();
        servidor.guardaLog();
        servidor.cerrarConexion();
    }
}
