package bridge;

public class Main {

	public static void main(String[] args) {
		Dolares dolares = new Dolares();
		Ahorro ahorro = new Ahorro(dolares);
		ahorro.cuenta();
		
		Bolivianos bolivianos = new Bolivianos();
		Credito credito = new Credito(bolivianos);
		credito.cuenta();
		
		Euros euros = new Euros();
		PlazoFijo plazoFijo = new PlazoFijo(euros);
		plazoFijo.cuenta();
		
	
		
		

	}

}
