package labAula06;

public class ValorMayorIgual {
	//ejercicio3 Encontrar el primer valor mayor o igual a x
	
	public static int mayorIgual(int[] array, int x) {
		//retorna la posicion si encuentra x ; si no lo encuentra retorna el valor mayor o
		//retorna -1 en caso x sea el mayor a todo el array 
		int left = 0;		//izquierda
		int r = array.length -1 ;	//derecha
		int mid , valor = -1;
		while(left <= r) {
			mid = left + (r- left)/2;
			if(array[mid] == x)
				return mid;
			if(array[mid] < x) {
				left = mid+1;
			}
			else {
				valor = mid;
				r = mid-1;
			}
		}
		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 6, 8, 10, 12};
		System.out.println(arr[mayorIgual(arr, 4)]);
	}

}
