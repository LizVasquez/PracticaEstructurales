package visitor;

public class Caballo implements IElemento{
	private String enfermedad = "fiebre";
	
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
