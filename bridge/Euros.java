package bridge;

public class Euros implements IMoneda {
	private double monto = 200.0;
	




	@Override
	public void tipoCambio() {
		double total = monto/8;
		System.out.println("Euros: " + total);
		
	}

}
