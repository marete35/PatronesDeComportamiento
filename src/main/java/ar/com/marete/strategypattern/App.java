package ar.com.marete.strategypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Supongamos un caso donde un instituto educativo tiene una lista de alumnos ordenados por promedio.
 * Dicho instituto suele competir en torneos intercolegiales, en campeonatos nacionales y tambien
 * en competencias internacionales.
 *
 * Obviamente la cantidad de gente que participa en cada competencia es distinta: por ejemplo, para los
 * campeonatos locales participan los 3 mejores promedios, pero para las competencias internacionales,
 * solo se envia al mejor promedio de todos.
 */
public class App {

    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        ArrayList<Alumno> alumnos = colegio.getAlumnos();

        IListadoStrategy st = new CompetenciaNacional();
        //se puede evitar que el cliente
        //conozca los strategy concretos

        List rta = st.getListado(alumnos);

        //veamos el resultado del patron
        System.out.println("Los participantes son: ");
        for(int i=0; i < rta.size(); i++){
            Alumno alumno = (Alumno) rta.get(i);
            System.out.println(alumno.getNombre());
        }
    }
}
