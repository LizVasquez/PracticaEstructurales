package visitor;

import java.util.Date;

public class ConcreteVeterinario implements IVeterinario {
	Date date;
	


	@Override
	public String visit(Perro perro) {
		Date date = new Date();
		System.out.println("Visitando Perro con: " + perro.getEnfermedad() + " A las: " + date);
		return cura(perro.getEnfermedad());

	}

	@Override
	public String visit(Gato gato) {
		Date date = new Date();
		System.out.println(" Visitando Gato con: " + gato.getEnfermedad() + " A las: " + date);

		return cura(gato.getEnfermedad());
	}

	@Override
	public String visit(Caballo caballo) {
		Date date = new Date();
		System.out.println("Visitando Caballo con : " + caballo.getEnfermedad() + " A las: " + date);
		return cura(caballo.getEnfermedad());
	}

	public String cura(String enfermedad) {
		if (enfermedad == "fiebre") {
			return " con suero";

		} else if (enfermedad == "infeccion") {
			return " con antibioticos";

		}
		return "esta sano";

	}

}
