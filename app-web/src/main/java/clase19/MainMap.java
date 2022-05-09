package clase19;

import java.util.Scanner;

import clase10.Libro;
import clase7.Articulo;

public class MainMap {

	/**
	 * El usuario ingresa una opcion
	 * 1- alta
	 * 2- baja
	 * 3- modificar
	 * 4- listar
	 * @param args
	 */
	public static void main(String[] args) {
	
		Integer opcionIngresadaPorUsuario = 1;
		
		// Interface i = new ClaseQueImplementaLaInterface();		
		IAccion accion = AccionMap.getAccion(opcionIngresadaPorUsuario);//AltaAccion|BajaAccion|AccionDefault
		
		Articulo articulo = contruirArticulo();
		
		//ejecuto
		InMemoryDB.listAll();
		
		try {
			accion.exec(articulo);
		} catch (Exception e) {
			System.out.println("articulo missing");
		}
		
		InMemoryDB.listAll();
		
		InMemoryDB.delete(articulo.getId());
		
		InMemoryDB.listAll();
	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese titulo ");
		boolean error = true;
		do {
			try {
				art.setAutor(teclado.next());
				error = false;
			} catch (Exception e) {
				System.out.println("ingrese un valor");
				continue;
			}
		} while (error);
		error = true;
		
		System.out.println("Ingrese id ");
		do {
			try {
				art.setId(teclado.nextLong());
				error = false;
			} catch (Exception e) {
				System.out.println("ingrese un valor numerico");
				continue;
			}
		} while (error);
		error = true;
		
		System.out.println("Ingrese isbn");
		do {
			try {
				((Libro)art).setIsbn(teclado.next());
				error = false;
			} catch (Exception e) {
				System.out.println("ingrese un valor");
				continue;
			}
		} while (error);
		
		teclado.close();
		return art;
	}
}
