package ar.com.marete.visitorpattern;

public interface Visitor {

    public double visit(ProductoNormal normal);
    public double visit(ProductoDescuento reducido);
}
