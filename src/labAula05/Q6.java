package labAula05;

public class Q6 {

	//Q6: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// ciclo que depende del tamaño de p con limite n 
		//imprime el crecimiento de p y el p final
		int n = 10;
		int p = 0;
		for(int i = 1; p<=n; i++) {
			System.out.println(p);
			p = p + i;
		}
		System.out.println(p);
		
		/* 
		 * COMPLEJIDAD: O (n^2)
		 * Analizando primero tenemos:
		 * Primero tenemos:  p0 = 0;
		 * Segundo tenemos : p1 = p0 + 1;
		 * Tercero tenemos : p2 = p1 + 2;
		 * Cuarto tenemos :  p3 = p2 + 3;
		 * ..............................
		 * p2 = p0 + 1 + 2.
		 * pk = p0 + 1 + 2 + ... + k.//suma de los n primeros numeros
		 * pk = p0 + k(k+1)/2
		 * 
		 * pk = 0 + (k^2 + k)/2
		 * considerando el mayor complejidad
		 */
	}

}
