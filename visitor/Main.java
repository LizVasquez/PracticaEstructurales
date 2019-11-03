package visitor;

public class Main {

	public static void main(String[] args) {
		
		Perro perro = new Perro();
		Gato gato = new Gato();
		Caballo caballo = new Caballo();
		
		ConcreteVeterinario concreteVeterinario = new ConcreteVeterinario();
		
		System.out.println("Cura Perro: " + perro.accept(concreteVeterinario));
		System.out.println("Cura Caballo: " + caballo.accept(concreteVeterinario));
		System.out.println("Cura Gato: "  + gato.accept(concreteVeterinario));
		

	}

}
