package labAula04;

public class Pick_resume {
	
	//Ejercicio5 Que hace este algoritmo y cual es su complejidad?? 
	
	
	public static String pick_resume(String resumes) {
		//Este metodo recibe un String(cadena) y lo reduce a la mitad alternando entre eliminar la primera mitad y la ultima 
		//hasta que quede un solo caracter.
		String eliminate = "top";
		while(resumes.length() > 1) {
			if(eliminate.equals("top")) {
				resumes = resumes.substring(resumes.length()/2, resumes.length());
				eliminate = "bottom";
			}else if(eliminate.equals("bottom")) {
				resumes = resumes.substring(0, resumes.length()/2);
				eliminate = "top";
			}
		}
		return resumes.substring(0);
		/* La complejidad seria O(log2 n) 
		 * 
		 * Porque la variable de la que depende la duracion del ciclo siempre será reducida a la mitad
		 * n/2/2/2/2...y asi dependiendo del tamaño del String "n" hasta que sea 1
		 * 
		 * Seria n*2^-1... k veces
		 * n > 1
		 * n*(2^k^-1) > 1
		 * n = 2^k
		 * log2 n = log2 2^k
		 * log2 n = k 
		 * */
	}

	public static void main(String[] args) {
		// Caso de prueba para el metodo anterior.
		String x = "abcdefghij";
		System.out.println(pick_resume(x));
	}

}
