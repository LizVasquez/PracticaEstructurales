package adapter;

public class Lavadoras implements ArElectronicos2 {
	private int costo = 60;
	private String garantia = " 5 años de garantia";

	@Override
	public int costo() {
		System.out.println("Costo Lavadora: " + costo);
		return costo;
	}

	@Override
	public String garantia() {
		System.out.println("Garantia Lavadora: " + garantia);
		return garantia;
	}

}
