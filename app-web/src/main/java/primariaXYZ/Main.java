package primariaXYZ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		ArrayList<ConstructorAlumno> alumnos = new ArrayList<ConstructorAlumno>();
		ArrayList<ConstructorAlumno> alumnosNotaMasAlta = new ArrayList<ConstructorAlumno>();
		ArrayList<ConstructorAlumno> alumnosNotaMasBaja = new ArrayList<ConstructorAlumno>();
		int examenesAlumno = 0;
		float notaMasAlta = 0;
		float notaMasBaja = 10;
		System.out.println("ingresar numero de alumnos a evaluar");
		ConstructorAlumno alumno = null;
		float sumaTotal = 0;
		float promedioAlumno = 0;
		int numeroAlumnos = teclado.nextInt();
		
		
					
			for (int i = 0; i < numeroAlumnos; ++i) {
				//solicitar los datos
				System.out.println("ingresar nombre del alumno");
				String nombreAlumno = teclado.next();
				System.out.println("ingresar apellido del alumno");
				String apellidoAlumno = teclado.next();
				System.out.println("ingresar cantidad de examenes que realizó el alumno en el año");
				examenesAlumno = teclado.nextInt();
				
				//verificar que la cantidad de examenes ingresada no sobrepase la cantidad de examenes tomados en el anio
				if(examenesAlumno > 5) {
					System.out.println("el alumno no puede hace mas examenes de los evaluados en el año");
					break;
				}
				
				//crear el array para las notas de cada examen
				float notasExamenes[];
				notasExamenes = new float[examenesAlumno];
				
				// ingresar todas las notas de todos los examenes
				for (int i1 = 0; i1 < examenesAlumno; ++i1) {
					System.out.println("ingresar notas");
					float nota = teclado.nextFloat();
					
					if(nota > 10 || nota < 0) {
						System.out.println("la nota no puede ser mayor a 10 ni menor que 0");
						break;
					}
					
					notasExamenes[i1] = nota;
				}
				
				//crear el objeto con todos los datos y guardarlo en el array
				alumno = new ConstructorAlumno(nombreAlumno, apellidoAlumno, examenesAlumno, notasExamenes);
				alumnos.add(alumno);	
			}
				
				
				//verificar la nota mas alta y mas baja de todo el curso
				for (ConstructorAlumno i1 : alumnos) {
					for (float i2 : i1.notasExamenes ) {
						if (i2 > notaMasAlta) {
							notaMasAlta = i2;
						}
						if (i2 < notaMasBaja) {
							notaMasBaja = i2;
						}
					}
				}
				
				//guardar a los alumnos que obtuvieron esas notas
				for (ConstructorAlumno i1 : alumnos) {
					//booleanos para que no se guarden alumnos repetidos
					sumaTotal = 0;
					boolean verificado1 = false;
					boolean verificado2 = false;
					for (float i2 : i1.notasExamenes) {
						if (notaMasAlta == i2 && verificado1 == false) {
							alumnosNotaMasAlta.add(i1);
							verificado1 = true;
						}
						if (notaMasBaja == i2 && verificado2 == false) {
							alumnosNotaMasBaja.add(i1);
							verificado2 = true;
						}
						sumaTotal += i2;
					}
					promedioAlumno = sumaTotal / 5;
					i1.Promedio(promedioAlumno);

					System.out.println("promedio es igual a: " + sumaTotal + "/ " + examenesAlumno + "=" + promedioAlumno);
				}
				
				
				
			boolean esPromedio = false;
			String mnsj = "Los alumnos con las mejores notas son:";
			Debug(alumnosNotaMasAlta, notaMasAlta, mnsj, esPromedio);
			mnsj = "Los alumnos con las notas mas bajas son:";
			Debug(alumnosNotaMasBaja, notaMasBaja, mnsj, esPromedio);
			mnsj = " ";
			esPromedio = true;
			Debug(alumnos, 0, mnsj, esPromedio);
			

		// llamar a la funcion debugger para mostrar por consola todos los datos de cada alumno	
		
		teclado.close();
	}
	
	
	
	public static void Debug(ArrayList<ConstructorAlumno> alumnos, float nota, String m, boolean esPromedio) {
		if (esPromedio) {
			System.out.println("los alumnos que promocionan son:");
			System.out.println(" "); // <<< estos printIn estan para que sea mas legible la consola :)
			for (ConstructorAlumno i : alumnos) {
				if (i.promedioAlumno >= 7) {
					nota = i.promedioAlumno;
					ConstructorAlumno.Debugger(i, nota);
					System.out.println(" ");
				}
			}
			System.out.println("los alumnos que NO promocionan son");
			System.out.println(" ");
			for (ConstructorAlumno i : alumnos) {
				if (i.promedioAlumno < 7) {
					nota = i.promedioAlumno;
					ConstructorAlumno.Debugger(i, nota);
					System.out.println(" ");
				}
			}
		}
		else {
			System.out.println(m);
			System.out.println(" ");
			for (ConstructorAlumno i : alumnos) {
				ConstructorAlumno.Debugger(i, nota);
				System.out.println(" ");
			}
		}
	}
}



