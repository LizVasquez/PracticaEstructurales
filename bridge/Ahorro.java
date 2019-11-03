
package bridge;

public class Ahorro implements ICuenta{
	private IMoneda iMoneda;
	
	



	public Ahorro(IMoneda iMoneda) {
		this.iMoneda = iMoneda;
		
	
	}


	@Override
	public void cuenta() {
		System.out.println("Cuenta ahorro: ");
		iMoneda.tipoCambio();
		
		
		
		
	}

}
