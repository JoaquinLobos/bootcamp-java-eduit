package primariaXYZ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		ArrayList<ConstructorAlumno> alumnos = new ArrayList<ConstructorAlumno>();
		ArrayList<ConstructorAlumno> alumnosNotaMasAlta = new ArrayList<ConstructorAlumno>();
		ArrayList<ConstructorAlumno> alumnosNotaMasBaja = new ArrayList<ConstructorAlumno>();
		int notaMasAlta = 0;
		int notaMasBaja = 10;
		System.out.println("ingresar numero de alumnos a evaluar");
		ConstructorAlumno alumno = null;
		int numeroAlumnos = teclado.nextInt();
		
		
					
			for (int i = 0; i < numeroAlumnos; ++i) {
				//solicitar los datos
				System.out.println("ingresar nombre del alumno");
				String nombreAlumno = teclado.next();
				System.out.println("ingresar apellido del alumno");
				String apellidoAlumno = teclado.next();
				System.out.println("ingresar cantidad de examenes que realizó el alumno en el año");
				int examenesAlumno = teclado.nextInt();
				
				//verificar que la cantidad de examenes ingresada no sobrepase la cantidad de examenes tomados en el anio
				if(examenesAlumno > 5) {
					System.out.println("el alumno no puede hace mas examenes de los evaluados en el año");
					break;
				}
				
				//crear el array para las notas de cada examen
				int notasExamenes[];
				notasExamenes = new int[examenesAlumno];
				
				// ingresar todas las notas de todos lo examenes
				for (int i1 = 0; i1 < examenesAlumno; ++i1) {
					System.out.println("ingresar notas");
					int nota = teclado.nextInt();
					
					if(nota > 10) {
						break;
					}
					notasExamenes[i1] = nota;
				}
				
				//crear el objeto con todos los datos y guardarlo en el array
				alumno = new ConstructorAlumno(nombreAlumno, apellidoAlumno, examenesAlumno, notasExamenes);
				alumnos.add(alumno);	
				
				
				//verificar que alumno sacó la nota mas alta
				
				
				for (ConstructorAlumno i1 : alumnos) {
					for (int i2 : i1.notasExamenes ) {
						if (i2 > notaMasAlta) {
							notaMasAlta = i2;
						}
						if (i2 < notaMasBaja) {
							notaMasBaja = i2;
						}
					}
				}
				for (ConstructorAlumno i1 : alumnos) {
					boolean verificado1 = false;
					boolean verificado2 = false;
					for (int i2 : i1.notasExamenes) {
						if (notaMasAlta == i2 && verificado1 == false) {
							alumnosNotaMasAlta.add(i1);
							verificado1 = true;
						}
						if (notaMasBaja == i2 && verificado2 == false) {
							alumnosNotaMasBaja.add(i1);
							verificado2 = true;
						}
					}
				}
				
			}
			String mnsj = "Los alumnos con las mejores notas son:";
			Debug(alumnosNotaMasAlta, notaMasAlta, mnsj);
			mnsj = "Los alumnos con las notas mas bajas son:";
			Debug(alumnosNotaMasBaja, notaMasBaja, mnsj);

		// llamar a la funcion debugger para mostrar por consola todos los datos de cada alumno	

		
		teclado.close();
	}
	
	
	
	public static void Debug(ArrayList<ConstructorAlumno> alumnos, int nota, String m) {
		System.out.println(m);
		for (ConstructorAlumno i : alumnos) {
			ConstructorAlumno.Debugger(i, nota);
		}
	}
}



