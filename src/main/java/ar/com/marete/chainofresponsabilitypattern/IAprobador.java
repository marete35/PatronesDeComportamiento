package ar.com.marete.chainofresponsabilitypattern;

public interface IAprobador {

    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    public void solicitudPrestamo(int monto);

}
