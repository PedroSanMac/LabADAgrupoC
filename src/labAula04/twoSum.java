package labAula04;

public class twoSum {
	
	//ejercicio 3 : complejidad O(n^2) por dos ciclos anidados n*n
	//retorna true en caso que los indices i y j sean diferente y sus valores sumen 10
	public static boolean twoSum(int[] array) {
		for(int i =0;  i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(i != j && (array[i]+array[j]) == 10)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		
		System.out.println(twoSum(arr));
		//imprime true al encontrar 4+6 cumple todas las condiciones 

	}

}
