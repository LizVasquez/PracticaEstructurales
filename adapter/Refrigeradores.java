package adapter;

public class Refrigeradores implements ArElectronicos2{
	private int costo = 50;
	private String garantia = "1 a�o de garantia";

	@Override
	public int costo() {
		return costo;
	}

	@Override
	public String garantia() {
		return garantia;
	}

}
