package aereopuerto;

public class Superman extends Volador implements Aterrizable{

	public Superman(String nombre) {
		super(nombre);
	}

	public void aterrizar() {
		System.out.println(super.getNombre() + " bajando...");
	}

	//si el objeto superman no tuviese el permiso para aterrizar se enviaria esto
	@Override
	public void Mensaje() {
		System.out.println(" dejenme aterrizar porfa, soy" + super.getNombre());
	}

}
