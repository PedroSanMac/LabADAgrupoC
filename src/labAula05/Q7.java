package labAula05;

public class Q7 {

	//Q7: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// imprime el doble del anterior hasta n
		int n = 10;
		for(int i = 1; i<n; i=i*2) {
			System.out.println(i);
		}
		
		/* 
		 * COMPLEJIDAD: O(log2 n)
		 * La línea 1 ejecutará log n veces.
		 * La complejidad del tiempo se convierte en O (log n).
		 * El ciclo se ejecuta para n iteraciones 
		 * i se incrementa en un factor de 2,
		 * la complejidad del tiempo será log n (Base 2) si i incrementa por un factor de 2.
		 * 
		 */
	}

}
