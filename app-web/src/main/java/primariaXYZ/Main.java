package primariaXYZ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		ArrayList<ConstructorAlumno> alumnos = new ArrayList<ConstructorAlumno>();
		System.out.println("ingresar numero de alumnos a evaluar");
		ConstructorAlumno alumno = null;
		int numeroAlumnos = teclado.nextInt();
		
		
					
			for (int i = 0; i < numeroAlumnos; ++i) {
				System.out.println("ingresar nombre del alumno");
				String nombreAlumno = teclado.next();
				System.out.println("ingresar apellido del alumno");
				String apellidoAlumno = teclado.next();
				System.out.println("ingresar cantidad de examenes que realizó el alumno en el año");
				int examenesAlumno = teclado.nextInt();
				
				if(examenesAlumno > 5) {
					System.out.println("el alumno no puede hace mas examenes de los evaluados en el año");
					break;
				}
				
				int notasExamenes[];
				notasExamenes = new int[examenesAlumno];
				
				for (int i1 = 0; i1 < examenesAlumno; ++i1) {
					System.out.println("ingresar notas");
					int nota = teclado.nextInt();
					notasExamenes[i1] = nota;
				}
				
				alumno = new ConstructorAlumno(nombreAlumno, apellidoAlumno, examenesAlumno, notasExamenes);
				alumnos.add(alumno);	
				
			}
			
		for (ConstructorAlumno i : alumnos) {
			ConstructorAlumno.Debugger(i);
		}
		
		teclado.close();
	}
}
