package ar.com.marete.commandpattern;

/**
 * Ahora realizaremos un invocador, es decir, una clase que simplemente llame al metodo execute.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }

}
