package ar.com.marete.chainofresponsabilitypattern;

public class EjecutivoDeCuenta implements IAprobador{

    private IAprobador next;

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if(monto <= 10000){
            System.out.println("Lo manejo yo, el ejecutivo de cuentas");
        }else{
            next.solicitudPrestamo(monto);
        }
    }


}
