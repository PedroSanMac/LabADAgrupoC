package labAula10;


public class MaxSegment {
	/*
	 * Escribe una función:
	 * clase Solución {solución pública int (int [] A, int [] B); }
	 * que, dadas dos matrices A y B que constan de N números enteros, 
	 * devuelve el tamaño de un conjunto no superpuesto que contiene un número máximo de segmentos.
	 */
	
	public static int solution(int[] A, int[] B) {
		/*
		 * Como estan ordenados por la posicion donde terminan, se usan estos para saber
		 * que no estan superpuestos.
		 * Si el comienzo es mayor a donde termino el anterior segmento se agrega un segmento mas al 
		 * contador y se actualiza el final. 
		 */
		//n
		// k->posicion en el array fin   0 <= k < n-1
		int n = -1;//numero de posibles segmentos
		int numSegment = 0;
		if(A.length == B.length) {//si las matrices tienen la misma longitud
			for(int i = 0; i<A.length; i++) {//recorro una matriz
				if(A[i] > n) {
					n = B[i];
					numSegment++;
				}
			}
		}
		
		return numSegment;
	}

	public static void main(String[] args) {
		// Main para el caso de prueba
		int n;//no nos dice el valor de N y no lo usa.
		
		int [] a = { 1, 3, 7, 9, 9};
		int [] b = { 5, 6, 8, 9, 10};
		System.out.println(solution(a,b));//imprime el retorno del metodo solution

	}

}
