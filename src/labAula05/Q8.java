package labAula05;

public class Q8 {

	//Q8: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// imprime la mitd del anterior dependiendo de n
		int n = 10;
		for(int i = n; i>=1; i=i/2) {
			System.out.println(i);
		}
		/*
		 * COMPLEJIDAD: O(log2 n)
		 * Obteniendo i = n / 2 ----> k;
		 * Al finalizar el analisis tenemos:
		 * n / 2 -------->   k < 1
		 * Por lo tanto tenemos k = log n, 
		 *  Tiempo: log2(n);
		 *  Incluimos un dos por a operacion i = i/2
		 *  
		 */
	}

}
