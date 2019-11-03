package bridge;

public class Bolivianos implements IMoneda {
	private double monto = 100.0;
	
	

	@Override
	public void tipoCambio() {
	
		System.out.println("bolivianos: " + monto);
		
	}

}
