package ar.com.marete.commandpattern;

public class ResetServer implements Command{

    private IServer servidor;
    public ResetServer(IServer servidor){
        this.servidor = servidor;
    }

    @Override
    public void execute() {
            servidor.conectate();
            servidor.verificaConexion();
            servidor.guardaLog();
            servidor.apagate();
            servidor.prendete();
            servidor.guardaLog();
            servidor.cerrarConexion();
    }
}
