package labAula12;
import java.util.*;

public class ejercicio1 {
	/*
	 * Dada una serie de cadenas, agrupa los anagramas.
	 */
	public static List<List<String>> groupAnagrams(String[] strs) {
		/*
		 * Metodo que retorna un arreglo de arreglos de String.
		 * Usa el metodo ordenar como clave para agrupar los anagramas.
		 * Si ninguno de los primeros elementos de los arrays coincide con la clave:
		 * crea un nuevo array y lo agrega. 
		 */
		List<List<String>> listList = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>();
		for (String x : strs) {
			String clave = ordenar(x);
			if(listList.isEmpty()) {
				a.add(x);
				listList.add(a);
			}
			else {
				boolean flag = false;
				for(List<String> y : listList) {
					if(ordenar(y.get(0)).equals(clave)) {
						y.add(x);
						flag = true;
					}
				}
				if(flag == false) {
					ArrayList<String> aux = new ArrayList<>();
					aux.add(x);
					listList.add(aux);
				}
			}
		}
		return listList;
    }
	public static String ordenar(String x) {
		//Convierte la palabra a un arreglo de caracteres y lo ordena. para los anagramas la respuesta sera la misma.
		//Retorna el string de caracteres ordenados.
		char [] rpta = x.toCharArray();
		Arrays.sort(rpta);
		String str = new String(rpta);
		return str;
	}
	
	public static void main(String[] args) {
		// Main para probar el metodo agrupar anagramas.
		
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(str));

	}

}
