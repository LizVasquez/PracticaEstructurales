package proxy;



public class Servidor implements IPeticion{
	private Request request;
	private PeticionReal bancoReal = null;
	
	public Servidor(Request request) {
		this.request = request;
	}

	@Override
	public void request() {
		if (bancoReal == null) {
			bancoReal = new PeticionReal(request);	
		}
		if (request.getFormato()==".zip" || request.getFormato() == ".rar" ){
			this.bancoReal.request();
			System.out.println("Guardando en el Servidor 2");
			
		}else {
			System.out.println("Solo se pueden cargar o desgarcar archivos .zip y .rar");
		}
		
	}
	
}
