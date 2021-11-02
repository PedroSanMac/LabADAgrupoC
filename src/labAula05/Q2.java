package labAula05;

public class Q2 {

	//Q2: Cual es el tiempo de complejidad de:
	public static void main(String[] args) {
		//imprimir conteo regresivo hasta el 1.
		int n = 10;
		for (int i = n; i > 0 ; i--) {
			//statement;
			System.out.println(i);
		}
	}
	
	/*
	 * El tiempo de complejidad siempre va a depender del tamaño de n 
	 * recorre desde n hasta 0 disminuyendo de uno en uno
	 * Asi que seria O(n)
	 */

}
