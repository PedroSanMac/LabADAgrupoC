package labAula07;

public class DFS {
	static int color = 2;
	
	public static void dfs_recursive(int[][] array, int fila, int colum) {
		array[fila][colum] = color;//marcar el lugar
		for(int i=0; i<4; i++ ) {//sus vecinos puede ser maximo 4
			switch (i) {
			case 0: {
				if(fila - 1 >= 0)
					if(array[fila-1][colum] == 0)
						dfs_recursive(array, fila-1, colum);
				break;
			}
			case 1:{
				if(colum - 1 >= 0)
					if(array[fila][colum-1] == 0)
						dfs_recursive(array, fila, colum-1);
				break;
			}
			case 2:{
				if(fila + 1 < array.length)//array[].length
					if(array[fila+1][colum] == 0)
						dfs_recursive(array, fila+1, colum);
				break;
			}
			case 3:{
				if(colum + 1 < array.length)
					if(array[fila][colum+1] == 0)
						dfs_recursive(array, fila, colum+1);
				break;
			}
			default:
				System.out.println("incorrecto");
			}
		}
	}
	static void ver(int [][] arr) {
		for(int[] x : arr) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [][] arr = {{1, 1, 1, 1, 1, 1},
						{1, 0, 0, 0, 0, 1},
						{1, 0, 0, 0, 0, 1},
						{1, 0, 0, 0, 0, 1},
						{1, 0, 0, 0, 1, 0},
						{1, 1, 1, 1, 0, 0},};
		
		ver(arr);
		System.out.println("---------------");
		dfs_recursive(arr, 2, 2);
		ver(arr);
		
	}
}
