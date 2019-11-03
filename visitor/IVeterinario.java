package visitor;

public interface IVeterinario {
	public String visit(Perro perro);
	public String visit(Gato gato);
	public String visit(Caballo caballo);

}
