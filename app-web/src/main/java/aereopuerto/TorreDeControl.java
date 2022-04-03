package aereopuerto;

public class TorreDeControl {

		public static void main(String[] args) {
			
		//simular que existen varios voladores
		Volador[] voladores = CreadorDeVoladores.crearVoladores();

		//analizar si pueden aterrizar en la pista
		for(Volador v : voladores) {
				
			//cumple con el contrato?
			if(v instanceof Aterrizable) {
				Aterrizable a = (Aterrizable)v;
				a.aterrizar();
			}
			else {
				v.Mensaje();
			}
		}
			
	}

}

