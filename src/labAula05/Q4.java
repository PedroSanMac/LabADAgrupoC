package labAula05;

public class Q4 {
	
	//Q4: Cual es el tiempo de complejidad de:

	public static void main(String[] args) {
		// Programa que imprime una matriz n x n.
		int n = 4;
		for(int i = 0;i < n; i++) {
			for(int j = 0; j<n; j++){
				System.out.print(j+""+i + " ");
			}
			System.out.println();
		}
		/*Complejidad n al cuadrado
		 * Son dos ciclos de complejidad O(n)
		 * y como uno esta dentro del otro se multiplica.
		 * O(n^2)
		 * 
		 * */
	}

}
