package labAula06;

public class Binary_search {
	//Ejercicio1 busqueda binaria.
	
	public static int binary(int[] array, int x) {
		//retorna la posicion si encuentra x ; si no lo encuentra retorna -1
		int left = 0;		//izquierda
		int r = array.length -1 ;	//derecha
		int mid;
		while(left <= r) {
			mid = left + (r- left)/2;
			if(array[mid] == x)
				return mid;
			if(array[mid] < x)
				left = mid+1;
			else
				r = mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// Metodo de prueba para busqueda binaria
		int[] arr = { 2, 3, 5, 6, 8, 10, 12};
		System.out.println(binary(arr, 10));
		

	}

}
