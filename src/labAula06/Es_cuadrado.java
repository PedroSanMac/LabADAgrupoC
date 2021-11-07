package labAula06;

public class Es_cuadrado {
	//Ejercicio 2 Determinar si un numero tiene raiz cuadrada.
	
	public static boolean es_cuadrado(int x) {
		//Crear un array y busca si el numero es igual al cuadrado de algun elemento del array.
		int[] array = new int[x];
		llenar(array);
		int left = 0;		//izquierda
		int r = array.length -1 ;	//derecha
		int mid;
		while(left <= r) {
			mid = left + (r- left)/2;
			if(array[mid]*array[mid] == x)
				return true;
			if(array[mid]*array[mid] < x)
				left = mid+1;
			else
				r = mid-1;
		}
		return false;
	}
	public static void llenar(int[] array) {
		for(int i=0; i< array.length;i++) {
			array[i] = i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(es_cuadrado(16));

	}

}
