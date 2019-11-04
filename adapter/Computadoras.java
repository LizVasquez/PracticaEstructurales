package adapter;

public class Computadoras implements ArElectrinicos1{
	private int precio = 300;
	private String vida = "10 años";


	@Override
	public int precio() {
		return precio;
	}

	@Override
	public String tiempoVida() {
		return vida;
	}

}
