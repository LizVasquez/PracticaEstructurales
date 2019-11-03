package proxy;

public class Main {

	public static void main(String[] args) {
		IPeticion p1 = new Servidor(new Request("Descarga", "archivo1", ".zip"));
		IPeticion p2 = new Servidor(new Request("Descarga", "archivo2", ".rar"));
		IPeticion p3 = new Servidor(new Request("Carga", "archivo4", ".zip"));
		
		p1.request();
		p2.request();
		p3.request();

	}

}
