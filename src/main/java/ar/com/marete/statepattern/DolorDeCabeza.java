package ar.com.marete.statepattern;

public class DolorDeCabeza implements ISaludState{

    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la cabeza";
    }
}
