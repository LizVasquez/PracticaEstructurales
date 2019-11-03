package bridge;

public class PlazoFijo implements ICuenta{
	private IMoneda iMoneda;
	//private double interes;



	public PlazoFijo(IMoneda iMoneda) {
		this.iMoneda = iMoneda;
		//this.monto = monto;
		 //this.interes = interes;
	}


	@Override
	public void cuenta() {
		System.out.println("Plazo Fijo: " );
		iMoneda.tipoCambio();
		
		
		
		
	}

}
