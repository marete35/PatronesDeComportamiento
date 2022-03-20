package ar.com.marete.chainofresponsabilitypattern;

public class LiderTeamEjecutivo implements IAprobador{

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
        if(monto>=10000 && monto <= 50000){
            System.out.println("Lo manejo yo, el lider");
        }else{
            next.solicitudPrestamo(monto);
        }
    }
}
