package labAula09;
import java.util.*;

public class SubsecuenciaMasLarga {
	/*
	 * Dada una matriz de enteros nums, devuelve la longitud 
	 * de la subsecuencia estrictamente creciente más larga.
	 */
	
	public static int lengthOfLIS(int[] nums) {
		/*
		 * Metodo que retorna la cantidad de elementos que forman la subsecuencia creciente mas larga.
		 * 
		 * Se recorre todo el arreglo recibido empezando desde el segundo elemento.
		 * se compara con los anteriores para saber cuantos son menores y se almacena la mayor cantidad en el arreglo auxiliar.
		 */
		
		if(nums == null || nums.length ==0){//caso especial al recibir un arreglo vacio.
            return 0;
        }
        
        int largo = nums.length;
        int[] aux= new int[largo];//Se crea un arreglo auxiliar
        Arrays.fill(aux,1);//iniciamos todo el array con 1 
        int maximo =1;
        for(int i=1; i<largo; i++){
            for(int j=0; j<i; j++){
                if(nums[i]> nums [j]){
                    aux[i] =Math.max(aux[i], aux[j] +1);
                }
            }
            maximo = Math.max(maximo,aux[i]);
        }
        
        return maximo;
        
    }
    
    public static void main(String[]args){
    	//Main para probar el metodo anterior.
    	int arr[] = {0,1,0,3,2,3 }; 
		System.out.println(lengthOfLIS(arr));

	}  
    

	
}
