package ar.com.marete.chainofresponsabilitypattern;

public class Director implements IAprobador{

    private IAprobador next;

    @Override
    public void setNext(IAprobador aprobador) {
        this.next = aprobador;
    }

    @Override
    public IAprobador getNext() {
        return this.next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if(monto >= 100000){
            System.out.println("Lo manejo yo, el director");
        }
    }
}
