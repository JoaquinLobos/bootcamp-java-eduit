package aereopuerto;

public class Helicoptero extends Volador{

	public Helicoptero(String nombre) {
		super(nombre);
	}
	
	public void Mensaje() {
		System.out.println(super.getNombre() + " aterrizare en otra pista");
	}

}
