package proxy;

public class PeticionReal implements IPeticion {
	Request request;

	public PeticionReal(Request request) {
		this.request = request;
	}

	@Override
	public void request() {
		System.out.println("Request Real Subject: " + this.request.getOperacion() +" del " + this.request.getArchivos()
		+this.request.getFormato()+ " exitoso");
	}
	
	
	
	

}
