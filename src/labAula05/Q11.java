package labAula05;

public class Q11 {

	//Q11: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// Imprime el doble del anterior mientras sea menor que p
		// p crece dependiendo el numero de veces que n se pueda dividir por la mitad hasta ser 1.
		int n = 10;
		int p = 0;
		for(int i = 1; i<n; i=i*2) {
			p++;
		}
		System.out.println(p);
		for(int j = 1; j<p; j=j*2) {
			System.out.println(j);
		}
		/* 
		 * COMPLEJIDAD: O(log2 n)
		 * Al tener 2 ciclos de complejidad log2 n separados, se considera el de mayor complejidad.
		 * La complejidad del tiempo se convierte en O (log n).
		 * El ciclo se ejecuta para n iteraciones 
		 * i se incrementa en un factor de 2,
		 * la complejidad del tiempo será log n (Base 2) si i incrementa por un factor de 2.
		 * 
		 */
	}

}
