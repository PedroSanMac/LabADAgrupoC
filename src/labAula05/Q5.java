package labAula05;

public class Q5 {
	
	//Q5: Cual es el tiempo de complejidad de:

	public static void main(String[] args) {
		// Programa que imprime un triangulo rectangulo
		int n = 10;
		for(int i = 0;i < n; i++) {
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/* COMPLEJIDAD: O(n^2)
		 * los bucles necesitan n iteraciones para terminar
		 * Pero tenemos un bucle anidado
		 * un bucle for anidado, por lo cual el bucle interno
		 * bucle interno n*n= n^2= =O(n^2)
		
		 
		 */
	}

}
