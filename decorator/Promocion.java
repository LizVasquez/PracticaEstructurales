package decorator;

public class Promocion extends DecoratorCuenta{
	private int promo;

	public Promocion(ICuenta iCuenta, int promo) {
		super(iCuenta);
		this.promo = promo;
	}

	@Override
	public String propietario() {
		return getiCuenta().propietario() + " Promocion";
	}

	@Override
	public int monto() {
		if (promo == 2 || promo == 4|| promo == 6) {
			return getiCuenta().monto() *2;
		}else {
			return getiCuenta().monto();
			
		}
		
	}
	

}
