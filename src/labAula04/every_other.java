package labAula04;

public class every_other {
	
	//ejercicio 2
	//Se escribio el codigo en JAVA y notamos que es de complejidad O(n^2) por tener dos ciclos anidados  n * n
	
	public static void every_other(int[] array) {
	//imprime los valores del array sumados con el valor de las posiciones pares.
		for (int i =0;i<array.length;i++) {
			if(i % 2 == 0) {
				for(int x : array)
					System.out.print((array[i]+x)+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,5,4,6};
		every_other(arr);

	}

}
