package labAula10;

public class TieRopes {
	/*
	 * Escribe una funci�n:
	 * class Solution {soluci�n p�blica int (int K, int [] A); }
	 * que, dado un n�mero entero K y una matriz A no vac�a de N n�meros enteros,
	 * devuelve el n�mero m�ximo de cuerdas de longitud mayor o igual que K que se pueden crear.
	 */
	
	public static int solution(int K, int[] A) {
		/*
		 * Mientras la cuerda no sea mayor que el k recibido se sumara con la cuerda siguiente
		 * hasta ser mayor y se agregara uno mas al contador rpta.
		 */
        int rpta = 0;
        int length = 0;
        for (int x : A) {
            length += x;
            if (length >= K) {
                rpta++;
                length = 0;//como la cuerda unida es mayor que k se reinicia el largo de la cuerda
            }
        }
        return rpta;
    }

	public static void main(String[] args) {
		// Main para probar el metodo anterior con el caso de prueba base
		int [] a = { 1, 2, 3, 4, 1, 1, 3};
		System.out.println(solution(4, a));

	}

}
