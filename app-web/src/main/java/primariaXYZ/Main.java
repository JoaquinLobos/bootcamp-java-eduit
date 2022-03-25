package primariaXYZ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		ArrayList Alumnos = new ArrayList();
		System.out.println("ingresar numero de alumnos a evaluar");
		int numeroAlumnos = teclado.nextInt();
					
			for (int i = 0; i < 5; ++i) {
				    
				ConstructorAlumno Alumno = new ConstructorAlumno();
				Alumnos.add("something");
					
					
				System.out.println(Alumnos.toArray());
					
				if (i >= numeroAlumnos) {
					break;
				}
			}
		teclado.close();
	}
}
