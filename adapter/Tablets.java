package adapter;

public class Tablets implements ArElectrinicos1 {
	private int precio = 200;
	private String vida = "3 años";


	@Override
	public int precio() {
		System.out.println("Precio de la Tablet: " + precio);
		return precio;
	}

	@Override
	public String tiempoVida() {
		System.out.println("Tiempo de vida de la tablet: " + vida);
		return vida;
	}

}
