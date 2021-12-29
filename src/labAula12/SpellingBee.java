package labAula12;
import java.util.*;

public class SpellingBee {
	/*
	 * Imprima la lista de palabras que coinciden con el acertijo de Spelling Bee 
	 * en el orden en que aparecen en el diccionario. 
	 * Se le garantiza que al menos una entrada del diccionario coincidirá.
	 */
	
	public static boolean coincide(String clave , String evaluar) {
		//retorna verdadero si todas las letras de la palabra a evaluar estan en la clave
		char[] x = descomponer(evaluar);
		for(char a : x) {
			if(!clave.contains(a+"")) {
				return false;
			}
		}
		return true;
	}
	public static char[] descomponer(String x) {
		//retorna un arreglo de caracteres de la palabra recibida
		char[] rpta = new char[x.length()];
		for(int i = 0 ; i < rpta.length ;i++) {
			rpta[i] = x.charAt(i);
		}
		return rpta;
	}
	

	public static void main(String[] args) {
		/*
		 * Main que evalua cada palabra y comprueba que contenga la letra principal
		 * si es asi pues comprueba que todas sus letras estén en el conjunto de letras del hexagono.
		 * guarda todas en el Array y al final las imprime. 
		 */
		Scanner sc = new Scanner(System.in);
		String central = sc.nextLine();
		char[] clave = descomponer(central);
		int tam = sc.nextInt();
		ArrayList<String> diccionario = new ArrayList<String>();
		for(int i =0; i <= tam; i++) {
			String x = sc.nextLine();
			if(x.contains(""+clave[0])) {
				if(coincide(central, x)) {
					diccionario.add(x);
				}
			}
			
		}
		
		for(String a : diccionario) {
			System.out.println(a);
		}
		

	}

}
