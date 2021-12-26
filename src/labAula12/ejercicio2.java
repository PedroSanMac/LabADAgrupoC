package labAula12;

import java.util.*;

public class ejercicio2 {
	/*
	 * Un borde de una cadena es un prefijo que también es un sufijo de la cadena,
	 * pero no todo cuerda. Por ejemplo, los bordes de abcababcab son ab y abcab.
	 */
	
	
	public static int[] falla(String x) {
		/*
		 * Metodo que calcula el arreglo con los pefijo sufijo mas largo de KMP. 
		 */
		int m = x.length();
		int[] tF = new int[m];
		tF[0] = 0;
		int i=1, j=0;
		while(i<m) {
			if(x.charAt(j) == x.charAt(i)) {
				tF[i] = j+1;
				i++;
				j++;
			}
			else if(j>0) {
				j = tF[j-1];
			}
			else{
				tF[i] = 0;
				i++;
			}
		}
		return tF;
	}
	private static void imprimir(ArrayList<Integer> x) {
		//Metodo para imprimir desde el ultimo elemento al primero con un espacio entre ellos.
		for(int i=x.size()-1; i>=0; i--) {
			System.out.print(x.get(i) + " ");
		}

	}
	

	public static void main(String[] args) {
		/* Main que recibe una cadena de entrada y calcula el prefijo-sufijo mas grande 
		*  y luego sigue calculando el prefijo sufijo mas grande del sufijo obtenido.
		*  
		*/ 
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		ArrayList<Integer> x = new ArrayList<Integer>();
	
		int rpta =falla(entrada)[entrada.length()-1];
		x.add(rpta);
		while(rpta > 0){
			String e2 = entrada.substring(entrada.length() - rpta, entrada.length());
			rpta = falla(e2)[e2.length()-1];
			if(rpta > 0)
				x.add(rpta);
		}
		imprimir(x);
		
	}

}
