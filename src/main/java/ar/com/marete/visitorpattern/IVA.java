package ar.com.marete.visitorpattern;

public class IVA implements Visitor{

    public final double impuestoNormal = 1.21;
    public final double impuestoReducido = 1.105;

    @Override
    public double visit(ProductoNormal normal) {
        return normal.getPrecio() * impuestoNormal;
    }

    @Override
    public double visit(ProductoDescuento reducido) {
        return reducido.getPrecio() * impuestoReducido;
    }
}
