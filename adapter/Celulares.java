package adapter;

public class Celulares implements ArElectrinicos1{
	private int precio = 100;
	private String vida = "5 a�os";


	@Override
	public int precio() {
		System.out.println("Precio del celular: " + precio);
		return precio;
	}

	@Override
	public String tiempoVida() {
		System.out.println("Tiempo de vida del celular: " + vida);
		return vida;
	}

}
