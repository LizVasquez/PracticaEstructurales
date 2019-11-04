package decorator;

public class Seguro extends DecoratorCuenta{
	private int seguro;

	public Seguro(ICuenta iCuenta, int seguro) {
		super(iCuenta);
		this.seguro= seguro;
	}

	@Override
	public String propietario() {
		return getiCuenta().propietario()+ " -Seguro: ";
	}

	@Override
	public int monto() {
		return getiCuenta().monto() - seguro;
	}

}
