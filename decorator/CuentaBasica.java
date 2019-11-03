package decorator;

public class CuentaBasica extends Banco {

	@Override
	public String propietario() {
		return "Juan Perez Perez tiene: ";
	}

	@Override
	public int monto() {
		return 100;
	}

}
