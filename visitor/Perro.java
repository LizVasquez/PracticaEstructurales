package visitor;

public class Perro implements IElemento {
	private String enfermedad = "feliz";
	
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
