package proxy;

public class Request {
	private String operacion;
	private String archivos;
	private String formato;
	
	
	public Request(String operacion,String archivos,String formato) {
		this.operacion = operacion;
		this.archivos= archivos;
		this.formato = formato;
	}


	public String getOperacion() {
		return operacion;
	}


	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getArchivos() {
		return archivos;
	}
	
	
	public void setArchivos(String archivos) {
		this.archivos = archivos;
	}

	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	

}
