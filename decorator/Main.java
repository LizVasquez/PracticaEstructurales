package decorator;

public class Main {

	public static void main(String[] args) {
		ICuenta c = new CuentaBasica();
		c =new BancaInternet(c, false);
		c = new Seguro(c, 20);
		c = new Promocion(c, 2);
		
		System.out.println(c.propietario());
		System.out.println(c.monto());

	}

}
