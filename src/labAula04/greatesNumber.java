package labAula04;

public class greatesNumber {
	
	public static int greatestNumber(int[] array) {
		//Ejercicio 1 reducir a O(n) 
		//Este metodo retorn el mayor valor que contiene el array
		int mayor = array[0];
		for (int x  : array) {
			if(x > mayor) {
				mayor = x;
			}
		}
		return mayor;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,5,4,6};
		System.out.println("El mayor del array: "+greatestNumber(arr));
		

	}

}
