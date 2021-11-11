package labAula06;

public class EncontrarMenor {
	
	public static int binary(int[] array) {
		//retorna la posicion si encuentra x ; si no lo encuentra retorna -1
		int left = 0;		//izquierda
		int r = array.length -1 ;	//derecha
		int mid, min = -1;
		while(left <= r) {
			mid = left + (r- left)/2;
			//if(array[mid] == array[r])
			//	return mid;
			if(array[mid] < array[r]) {
				min = mid;
				r = mid-1;
			}
			else {
				min = mid;
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
