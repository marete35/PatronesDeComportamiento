package ar.com.marete.mementopattern;

public class App {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Persona p = new Persona();
        p.setNombre("Maxi");
        p.setNombre("Juan");
        caretaker.addMemento(p.saveToMemento());
        p.setNombre("Pedro");

        caretaker.addMemento(p.saveToMemento());

        p.setNombre("Diego");

        Memento m1 = caretaker.getMemento(0);
        Memento m2 = caretaker.getMemento(1);

        System.out.println(m1.getSavedState());
        System.out.println(m2.getSavedState());
    }
}
