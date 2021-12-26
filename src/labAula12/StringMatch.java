package labAula12;

import java.util.*;

public class StringMatch {
	/*
	 * Para cada caso de prueba, genere una línea que contenga las posiciones 
	 * de todas las ocurrencias del patrón en el texto, de la primera a la última, 
	 * separadas por un solo espacio.
	 */
	public static int[] falla(String x) {
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
	
	public static int kmp(String texto, String patron) {
		//Algoritmo KMP, retorna la posicion donde empezó la coincidencia o -1 si no encuentra.
		int n = texto.length();
		int m = patron.length();
		
		int[] f = falla(patron);
		int i=0, j=0;
		
		while(i<n) {
			if(patron.charAt(j) == texto.charAt(i)) {
				if(j == m-1)
					return i-m+1;
				i++;
				j++;
			}
			else if(j>0) {
				j = f[j-1];
			}
			else
				i++;
		}
		return -1;
	}
	
	
	public static void imprimir(String txt, String clave) {
		/*
		 * Calcula la posicion de coincidencia con kmp y mientras el texto que queda sea mayor a la longitud de la clave
		 * seguira buscando coincidencias.
		 */
		int rpta = kmp(txt, clave);
		int limite = txt.length()- clave.length();
		if(rpta >= 0){
			System.out.print(rpta);
			while(rpta < limite) {
				int x =kmp(txt.substring(rpta+1, txt.length()), clave);
				if(x >= 0) {
					rpta = rpta + x +1;
					System.out.print(" "+rpta);
				}
				else {
					//System.out.println();
					break;
				}
			}
			
		}else {
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// Main para mostrar las posiciones donde se encontró la clave 
		// Cada 2 lineas muestra las posiciones hasta que ingrese una linea vacia.
		Scanner sc = new Scanner(System.in);
		
		String clave = sc.nextLine();
		while(!(clave.equals(""))) {
			
			String txt = sc.nextLine();
			imprimir(txt, clave);
			clave = sc.nextLine();
		}
		

	}

}
