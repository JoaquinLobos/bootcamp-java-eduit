package aereopuerto;

public class Avion extends Volador implements Aterrizable{

	public Avion(String nombre) {
		super(nombre);
	}

	public void aterrizar() {
		System.out.println(super.getNombre() + " aterrizando...");
	}
	
	
	//si el objeto avion no tuviese el permiso para aterrizar se enviaria esto
	@Override
	public void Mensaje() {
		System.out.println(super.getNombre() + " aterrizare en otra pista");
	}
}
