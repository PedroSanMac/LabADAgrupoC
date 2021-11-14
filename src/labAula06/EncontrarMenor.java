package labAula06;

public class EncontrarMenor {
	//ejercicio4 Encuentre el menor elemento en un array ordenado rotado
	
	public static int binary(int[] array) {
		//retorna la posicion del elemento con menor valor que encuentre.
		int left = 0;		//izquierda
		int r = array.length -1 ;	//derecha
		int mid, min = -1;
		while(left <= r) {
			mid = left + (r- left)/2;
			if(array[mid] == array[r]) {
				return min;
			}
			if(array[mid] < array[r]) {
				min = mid;
				r = mid-1;
			}
			else {
				min = r;
				left = mid+1;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 7, 9, 15, 19, 2, 3};
		System.out.println(arr[binary(arr)]);

	}

}
