package bridge;

public class Credito implements ICuenta{
	private IMoneda iMoneda;
	

	public Credito(IMoneda iMoneda) {
		this.iMoneda = iMoneda;
	
		
	}


	@Override
	public void cuenta() {
		
		System.out.println("Cuenta Credito: ");
		iMoneda.tipoCambio();
		
		
		
		
	}

}
