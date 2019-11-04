package decorator;

public abstract class DecoratorCuenta implements ICuenta{
	private ICuenta iCuenta;

	public DecoratorCuenta(ICuenta iCuenta) {
		this.iCuenta = iCuenta;
	}

	public ICuenta getiCuenta() {
		return iCuenta;
	}

	public void setiCuenta(ICuenta iCuenta) {
		this.iCuenta = iCuenta;
	}
	
	
	
	

}
