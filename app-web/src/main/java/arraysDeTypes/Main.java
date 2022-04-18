package arraysDeTypes;

public class Main {
	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5};
		
		CollectionCustom<Integer> arrayCustom = new CollectionCustom<Integer>(array);
		
		System.out.println("el tamanio del array es: " + arrayCustom.Size());
		arrayCustom.AddFirst(8);
		arrayCustom.AddLast(15);
		if (arrayCustom.Add(60)) {
			System.out.println("salio true");
		}
		
		System.out.println("valor removido: " + arrayCustom.Remove(3));
		arrayCustom.RemoveAll();
		System.out.println("el array esta vacio?: " + arrayCustom.Empty());
	}
}
