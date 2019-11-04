package adapter;

public class AdapterTele  implements ArElectrinicos1{
	private Televisores televisores = new Televisores();
	private int precio;
	private String vida;
	
	

	public AdapterTele(Televisores televisores ){
		this.televisores = televisores;
		
	}

	@Override
	public int precio() {
		precio= this.televisores.costo();
		return precio;
	}

	@Override
	public String tiempoVida() {
		vida= this.televisores.garantia();
		return vida;
	}

}
