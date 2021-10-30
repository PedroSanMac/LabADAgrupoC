package labAula04;

public class find_needle {
	
	//Ejercicio4 Complejidad O(n^2) por tener dos ciclos anidados
	
	public static boolean find_needle(String aguja, String nido) {
		//Metodo que retorna verdadero si encuentra el primer String dentro del segundo.
		
		int aguja_index = 0;
		int nido_index = 0;
		boolean encontrado = false;
		
		while (nido_index < nido.length()) {
			if(aguja.charAt(aguja_index) == nido.charAt(nido_index)) {
				encontrado = true;
				while (aguja_index < aguja.length()) {
					if(aguja.charAt(aguja_index) != nido.charAt(nido_index + aguja_index)) {
						encontrado = false;
						break;
					}
					aguja_index += 1;
				}
				if (encontrado)
					return true;
				aguja_index = 0;
			}
			nido_index += 1;
		}
		return false;
			
	}
	

	public static void main(String[] args) {
		//Main para demostrar el metodo find_needle.
		
		String aguja = "abc";
		String nido = "sdfgdabcdfg";
		
		System.out.println(find_needle(aguja, nido));

	}

}
