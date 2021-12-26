package labAula09;

public class CaminoUnico {
	/* Un robot est� ubicado en la esquina superior izquierda de una m x n
	 * El robot solo puede moverse hacia abajo o hacia la derecha en cualquier momento.
	 * El robot est� tratando de llegar a la esquina inferior derecha de la cuadr�cula.
	 * 
	 * */
	
	public static int uniquePathsWithObstacles(int [][] obstacleGrid) {
		/*
		 * Recorre y modifica la matriz recibida como parametro y en cada celda se guarda la cantidad de caminos 
		 * con el que se llegan a esa posicion. 
		 * Retorna el valor de la ultima casilla de la matriz que contiene la suma de la cantidad de caminos de la casilla una posicion arriba
		 * y una posicion a la izquierda.
		 */
		int x = obstacleGrid.length;
		int y = obstacleGrid[0].length;
		if(obstacleGrid[0][0] == 1) 
			return 0;
		for(int i = 0; i < x; i++) {
		    for(int j = 0; j < y; j++) {
		    	if(i == 0 || j ==0) { 
		    		if(obstacleGrid[i][j] == 1 || (i!=0 && obstacleGrid[i-1][0] == 0) || (j!=0 && obstacleGrid[i][j-1] == 0)) {
		    			obstacleGrid[i][j] = 0;
		    		}
		    		else {
		    			obstacleGrid[i][j] = 1;
		    		}
		    	}
		    	else {
		    		if(obstacleGrid[i][j] == 1) { 
		    			obstacleGrid[i][j] = 0;
		    		}
		    		else {
		    			obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
		    		}
		    	}
		    }
		}
		return obstacleGrid[x-1][y-1];
		
	}
	
	public static void main(String[] args) {
		
		//main para probar la funcion anteriror uniquePath con obstaculos.
		int[][] arr = {{0, 0, 0},
					{0, 1, 0},
					{0, 0, 0},};
		System.out.println(uniquePathsWithObstacles(arr));
		
	}

}
