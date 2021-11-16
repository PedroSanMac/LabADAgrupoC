package labAula05;

public class Q3 {
	
	//Q3: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		// Imprimir los numeros pares hasta n.
		int n = 10;
		for(int i = 0; i < n ;i=i+2) {
			System.out.println(i);
		}
		/*Complejidad O(n)
		 * recorre el arreglo de 2 en 2 
		 *  n + 2
		 *  se considera complejidad O(n) porque se toma el mayor.
		 * */
		
	}

}
