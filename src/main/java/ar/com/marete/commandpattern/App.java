package ar.com.marete.commandpattern;

public class App {

    public static void main(String[] args) {
        IServer server = new ArgentinaServer();
        Command command = new PrenderServer(server);
        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
