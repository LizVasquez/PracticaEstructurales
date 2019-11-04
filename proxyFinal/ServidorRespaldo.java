package proxy;

public class ServidorRespaldo implements IPeticion{

	@Override
	public void request() {
		System.out.println("Guardando en el Servidor de respaldo");
		
	}
	

}
