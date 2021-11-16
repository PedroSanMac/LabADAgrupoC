package labAula05;

public class Q10 {

	//Q10: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		//imprime dos veces los numeros del 0 a n
		int n=10;
		for(int i = 0; i < n; i++) {
			System.out.print(i+",");
		}
		
		System.out.println();
		for(int j = 0; j < n; j++) {
			System.out.print(j+"-");
		}
		/*
		 * COMPLEJIDAD: O (2n)= O(n)
		 * Explicación: Dos bucles for, uno anidado con otro. 
		 * El primer ciclo for tardará n tiempo ...
		 * los bucles necesitan n iteraciones para terminar declaraciones;
		 * considera 1 unidad de tiempo para una declaración estática
		 * 
		 */
		
	}
	

}
