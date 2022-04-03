package aereopuerto;

public abstract class Volador {

	private String nombre;
	
	public Volador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract void Mensaje();
	
}
