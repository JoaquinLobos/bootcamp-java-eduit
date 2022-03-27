package primariaXYZ;


public class ConstructorAlumno {
	
	String nombre;
	String apellido;
	int examenesAlumno;
	int notasExamenes[];
	
	public ConstructorAlumno(String nombre, String apellido, int examenesAlumno, int notasExamenes[]) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.examenesAlumno = examenesAlumno;
		this.notasExamenes = new int[examenesAlumno];
		for (int i1 = 0; i1 < examenesAlumno; ++i1) {
			this.notasExamenes[i1] = notasExamenes[i1];
		}
	}
	
	public static void Debugger(ConstructorAlumno alumno) {
		System.out.println("nombre: " + alumno.nombre + " " + alumno.apellido);
		System.out.println("cantidad de examenes realizados en el anio: " + alumno.examenesAlumno);
		
		for (int i1 : alumno.notasExamenes) {
			int contador = 0;
			System.out.println("nota " + contador + ": " + i1);
			contador++;
		}
	}

}
