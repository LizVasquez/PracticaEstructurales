package adapter;

public class Televisores implements ArElectronicos2{
	private int costo = 70;
	private String garantia = "2 a�os de garantia";

	@Override
	public int costo() {
		return costo;
	}

	@Override
	public String garantia() {
		return garantia;
	}

}
