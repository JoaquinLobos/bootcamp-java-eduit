package aereopuerto;

public class CreadorDeVoladores {

		public static Volador[] crearVoladores() {
			Avion avion = new Avion("Avion numero 1");
			Helicoptero h1 = new Helicoptero("helicoptero numero 2");
			Superman s = new Superman("clark kent");
			Ovni o = new Ovni();
			
			return new Volador[]{avion,h1,s,o};
		}
}

