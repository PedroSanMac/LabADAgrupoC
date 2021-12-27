package labAula10;

public class TieRopes {
	/*
	 * Escribe una función:
	 * class Solution {solución pública int (int K, int [] A); }
	 * que, dado un número entero K y una matriz A no vacía de N números enteros,
	 * devuelve el número máximo de cuerdas de longitud mayor o igual que K que se pueden crear.
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
