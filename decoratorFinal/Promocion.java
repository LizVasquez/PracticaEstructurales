package decorator;

public class Promocion extends DecoratorCuenta{
	private boolean promo;

	public Promocion(ICuenta iCuenta, boolean promo) {
		super(iCuenta);
		this.promo = promo;
	}

	@Override
	public String propietario() {
		return getiCuenta().propietario() + " Promocion";
	}

	@Override
	public int monto() {			
		if (promo) {
			System.out.println("Accediste A la promocion");
			return getiCuenta().monto() *2;
		}else {
			System.out.println("No tiene promocion ");
			return getiCuenta().monto();
			
		}
		
	}
	
	
	public void sorteo() {
		int r = (int) (Math.random() * 5 + 1);
		if(r %2 ==0) {
			this.setPromo(true);
			getiCuenta().monto();
			
		}
	}

	public boolean isPromo() {
		return promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}
	

}
