package bridge;

public class Dolares  implements IMoneda{
	private double monto = 100.0;
	

	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public void tipoCambio() {
		double total = monto/7;
		System.out.println("Dolares:  " + total);
	
		
	}

}
