package ar.com.marete.templatemethodpattern;

/**
 * Como ejemplo, imaginemos una empresa que posee socios, clientes, empleados, etc. Cuando se les solicite
 * que se identifiquen, cada uno lo realizara de distinta manera: quizas un empleado tiene un legajo, pero
 * un cliente tiene un numero de cliente, etc.
 */
public class App {

    public static void main(String[] args) {
        Persona p = new Cliente(12121);
        System.out.println("El cliente dice: ");
        System.out.println(p.identificate());

        System.out.println("El empleado dice: ");
        p = new Empleado("AD 41252");
        System.out.println(p.identificate());

        System.out.println("El socio dice: ");
        p = new Socio(46232);
        System.out.println(p.identificate());
    }
}
