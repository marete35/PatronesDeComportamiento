package ar.com.marete.mediatorpattern;

public interface IChat {

    public abstract void registra(Usuario participante);
    public abstract void envia(String from, String to, String message);
}
