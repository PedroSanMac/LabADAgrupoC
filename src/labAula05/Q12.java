package labAula05;

public class Q12 {

	//Q12: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// imprime el doble del anterior hasta n, n veces.
		int n = 10;
		for(int i = 0; i< n; i++) {
			for(int j=1; j<n; j=j*2) {
				System.out.println(j);
			}
			System.out.println("vuelta: "+(i+1));
		}
		/*
		 * COMPLEJIDAD: O(n*log2 n)
		 * El tiempo de ejecución crece en proporción an log n de la entrada:
		 * Por ejemplo, si  n es 8, entonces este algoritmo se ejecutará 8 * log (8) = 8 * 3 = 24 veces.
		 * Ahora si tenemos una desigualdad en el ciclo for es irrelevante una notación Big O.
		 * Desde ya este for aninado tiene un tiempo de n log n 
		 * Ahora nosotros incluimos 2 ala repsuesta 
		 * 
		 */
	}

}
