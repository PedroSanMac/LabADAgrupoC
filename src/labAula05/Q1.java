package labAula05;

public class Q1 {
	
	//Q1: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		//imprimir del 1 al numero n.
		int n = 10;
		for (int i = 0; i < n; i++) {
			//statement;
			System.out.println(i+1);
		}
	}
	
	/*
	 * El tiempo de complejidad siempre va a depender del tamaño de n 
	 * recorre desde 0 hasta n de uno en uno
	 * Asi que seria O(n)
	 */
	
	

}
