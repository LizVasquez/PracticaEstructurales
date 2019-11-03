package visitor;

public class Gato implements IElemento{
	private String enfermedad = "infeccion";
	
	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	@Override
	public String accept(IVeterinario veterinario) {
		return veterinario.visit(this);
	}

}
