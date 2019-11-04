package decorator;

public class BancaInternet extends DecoratorCuenta {
	private boolean enable;
	

	public BancaInternet(ICuenta iCuenta, boolean enable) {
		super(iCuenta);
		this.enable = enable;
		
	}


	@Override
	public String propietario() {
		return getiCuenta().propietario() + " Banca por internet:  " + enable;
	}


	@Override
	public int monto() {
		return getiCuenta().monto();
	}
	
	



	

}
