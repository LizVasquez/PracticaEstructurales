package adapter;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<ArElectrinicos1> a = new ArrayList<>();
		
		Televisores televisores = new Televisores();
		televisores.costo();
		televisores.garantia();
		
		Refrigeradores refrigeradores = new Refrigeradores();
		refrigeradores.costo();
		refrigeradores.garantia();
		
		Lavadoras lavadoras = new Lavadoras();
		lavadoras.costo();
		lavadoras.garantia();
		
		Celulares celulares =  new Celulares();
		celulares.precio();
		celulares.tiempoVida();
		
		Tablets tablets = new Tablets();
		tablets.precio();
		tablets.tiempoVida();
		
		Computadoras computadoras = new Computadoras();
		computadoras.precio();
		computadoras.tiempoVida();
		
		AdapterLava adapterLava = new AdapterLava(lavadoras);
		AdapterRefri adapterRefri = new AdapterRefri(refrigeradores);
		AdapterTele adapterTele = new AdapterTele(televisores);
		
		a.add(celulares);
		a.add(tablets);
		a.add(computadoras);
		a.add(adapterRefri);
		a.add(adapterTele);
		a.add(adapterLava);
		
		
		
		
		

	}

}
