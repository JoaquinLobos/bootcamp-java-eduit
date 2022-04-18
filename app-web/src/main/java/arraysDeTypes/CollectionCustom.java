package arraysDeTypes;

import java.util.Arrays;

public class CollectionCustom <T>{

	private T[] arrayOfTypes;
	
	public CollectionCustom(T[] array) {
		arrayOfTypes = array;
	}

	public int Size() {
	
		int size = arrayOfTypes.length;
		return size;
	}
	
	public void AddFirst(T parametro) {
		int contador = -1;
		T newArray[] = Arrays.copyOf(arrayOfTypes, (arrayOfTypes.length + 1));
		
		for (T i : newArray) {
			if (contador == -1) {
				newArray[contador + 1] = parametro;
			}
			else {
				newArray[contador + 1] = arrayOfTypes[contador];
			}
			contador++;
		}
		arrayOfTypes = newArray;
		System.out.println("nuevo tamanio: " + Size());
		Printer();
		System.out.println("termino 1");
	}
	
	public void AddLast(T parametro) {
		T newArray[] = Arrays.copyOf(arrayOfTypes, (arrayOfTypes.length + 1));
		newArray[newArray.length - 1] = parametro;
		arrayOfTypes = newArray;
		Printer();
		System.out.println("termino 2");
	}
	
	public boolean Add(T parametro) {
		boolean returning = false;
		AddLast(parametro);
		if (arrayOfTypes[arrayOfTypes.length-1] == parametro) {
			returning = true;
		}
		System.out.println("termino 3");
		return returning;
	}
	
	public T Remove(int pocision) {
		int contador = 0;
		int contador2 = 0;
		T returning = arrayOfTypes[pocision];
		
		T newArray[] = Arrays.copyOf(arrayOfTypes, arrayOfTypes.length - 1);
		System.out.println(newArray.length);
		System.out.println(arrayOfTypes.length);
		for (T i : arrayOfTypes) {
			if (contador <= newArray.length) {
				if (contador != pocision) {
				newArray[contador2] = arrayOfTypes[contador];
				System.out.println("lol");
				contador2++;
				}
				contador++;
			}
			
		}
		arrayOfTypes = newArray;
		System.out.println("termino 4");
		Printer();
		return returning;
	}
	
	public void RemoveAll() {
		T newArray[] = Arrays.copyOf(arrayOfTypes, 0);
		arrayOfTypes = newArray;
	}
	
	public boolean Empty() {
		boolean booleano = false;
		if (arrayOfTypes.length > 0) {
			booleano = false;
		}
		else {
			booleano = true;
		}
		return booleano;
	}
	
	private void Printer() {
		for (T i : arrayOfTypes) {
			System.out.println(i);
		}
	}
}
