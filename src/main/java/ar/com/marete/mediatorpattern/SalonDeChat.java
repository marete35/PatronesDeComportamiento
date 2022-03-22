package ar.com.marete.mediatorpattern;

import java.util.HashMap;

public class SalonDeChat implements IChat{

    private HashMap<String, Usuario> participantes = new HashMap<>();


    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(),user);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if(participantes.containsKey(de) && participantes.containsKey(a)){
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        }else{
            System.out.println("Usuario inexistente");
        }
    }
}
