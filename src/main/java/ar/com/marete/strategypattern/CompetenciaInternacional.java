package ar.com.marete.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class CompetenciaInternacional implements IListadoStrategy{
    @Override
    public List getListado(ArrayList lista) {
        ArrayList resultado = new ArrayList();
        resultado.add(lista.get(0));
        return resultado;
    }
}
