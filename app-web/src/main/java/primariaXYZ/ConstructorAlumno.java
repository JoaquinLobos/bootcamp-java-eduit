package primariaXYZ;


public class ConstructorAlumno {
	
	String nombre;
	String apellido;
	int examenesAlumno;
	float notasExamenes[];
	float promedioAlumno;
	
	public ConstructorAlumno(String nombre, String apellido, int examenesAlumno, float notasExamenes[]) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.examenesAlumno = examenesAlumno;
		this.notasExamenes = new float[examenesAlumno];
		for (int i1 = 0; i1 < examenesAlumno; ++i1) {
			this.notasExamenes[i1] = notasExamenes[i1];
		}
	}
	
	public static void Debugger(ConstructorAlumno alumno, float nota) {
		
		System.out.println("nombre: " + alumno.nombre + " " + alumno.apellido);
		System.out.println("nota: " + nota);
	}
	
	public void Promedio(float promedioAlumno) {
		this.promedioAlumno = promedioAlumno;
	}

}
