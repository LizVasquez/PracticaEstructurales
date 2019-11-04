package adapter;

public class AdapterRefri implements ArElectrinicos1{
	private Refrigeradores refrigeradores = new Refrigeradores();
	private int precio;
	private String vida;
	
	

	public AdapterRefri(Refrigeradores refrigeradores ){
		this.refrigeradores = refrigeradores;
		
	}

	@Override
	public int precio() {
		precio= this.refrigeradores.costo();
		return precio;
	}

	@Override
	public String tiempoVida() {
		vida= this.refrigeradores.garantia();
		return vida;
	}

}
