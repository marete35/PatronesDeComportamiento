package ar.com.marete.chainofresponsabilitypattern;

/**
 * Y por ultimo, el banco, que a fin de cuentas es quien decide las reglas de negocio.
 */
public class Banco implements IAprobador{

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
        EjecutivoDeCuenta ejecutivoDeCuenta = new EjecutivoDeCuenta();
        this.setNext(ejecutivoDeCuenta);

        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        ejecutivoDeCuenta.setNext(lider);

        Gerente gerente = new Gerente();
        lider.setNext(gerente);

        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(monto);
    }
}
