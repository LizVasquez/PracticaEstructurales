package adapter;

public class AdapterLava implements ArElectrinicos1{
	private Lavadoras lavadoras = new Lavadoras();
	private int precio;
	private String vida;
	
	

	public AdapterLava(Lavadoras lavadoras ){
		this.lavadoras = lavadoras;
		
	}

	@Override
	public int precio() {
		precio= this.lavadoras.costo();
		return precio;
	}

	@Override
	public String tiempoVida() {
		vida= this.lavadoras.garantia();
		return vida;
	}

}
