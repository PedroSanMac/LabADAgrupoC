package labAula05;

public class Q9 {

	//Q9: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		//imprime todos los numeros si su cuadrado no sobrepasa n
		int n=60;
		for (int i= 0; i*i < n; i++) { 
			System.out.println("obtenemos: " + i);
		}
		/*
		 * COMPLEJIDAD: O(n^2)
		 * el algoritmo requiere O(N^(1/2))evaluaciones donde el tamaño de la entrada 
		 *  i = sqrt(n)
		 * si dspejamos tendremos O(n^2)
		 * 
		 */
	}

}
