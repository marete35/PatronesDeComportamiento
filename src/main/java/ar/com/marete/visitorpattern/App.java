package ar.com.marete.visitorpattern;

/**
 * En Argentina todos los productos pagan IVA. Algunos productos poseen una tasa reducida.
 * Utilizaremos el Visitor para solucionar este problema.
 *
 * Hay dos grupos...los objetos que son visitable y los objetos que son los visitor(osea que visitan)
 */
public class App {

    public static void main(String[] args) {
        ProductoDescuento producto1 = new ProductoDescuento();
        producto1.setPrecio(100);
        ProductoNormal producto2 = new ProductoNormal();
        producto2.setPrecio(100);

        IVA iva = new IVA();
        double resultado1 = producto1.accept(iva);
        double resultado2 = producto1.accept(iva);

        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
