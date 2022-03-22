package ar.com.marete.mediatorpattern;

/**
 * Nuestro ejemplo sera un chat: donde habra usuarios que se comunican entre si en un salon de chat. Para ellos se
 * define una interface llamada Chateable que todos los objetos que quieran participar de un chat deberan implementar.
 */
public interface Chateable {

    public void recibe(String de, String msg);
    public void envia(String a, String msg);
}
