package ar.com.marete.statepattern;

public class DolorDePanza implements ISaludState{
    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la panza";
    }
}
