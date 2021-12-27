package labAula10;
import java.util.*;

public class BankQueue {
	/*
	 * Imprima una línea con la cantidad máxima de dinero que puede 
	 * obtener de las personas en la cola antes de que cierre el banco.
	 */

	 public static class client {
		 //Clase cliente para trabajar con los datos recibidos.
		 protected int ci;
		 protected int ti;

		 public client(int dinero, int tiempo){
		      this.ci = dinero;
		      this.ti = tiempo;
		 }

		 @Override
		 public String toString() {
		      // TODO Auto-generated method stub
		      return ci +  " : " + ti;
		 }
	}
	public static void sort(client [] num){
		    for (int i = 0; i < num.length - 1; i++) {
		      for (int j = 0; j < num.length - 1 ; j++) {
		        if(num[j].ci < num[j + 1].ci){
		          int actual = num[j].ci;
		          int actualT = num[j].ti;
		          num[j].ci = num[j + 1].ci;
		          num[j].ti = num[j + 1].ti;
		          num[j + 1].ci = actual;							
		          num[j + 1].ti = actualT;							
		        }				
		      }
		    }
	}
	 
	public static void main (String[]args){
		/*
		 * Main que ordena los datos recibidos por la cantidad.
		 * guarda los que tienen mayor cantidad en un arreglo siempre 
		 * y cuando el tiempo no haya pasado
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 
		int T = scan.nextInt(); 
		
		client [] arr = new client[N];
		int [] maximos = new int [T];
		for (int i = 0; i < N ; i++) {
			int dinero = scan.nextInt();
			int tiempo = scan.nextInt();
			arr[i] = new client(dinero, tiempo);
		}
		sort(arr);
		for(int i = 0; i < arr.length; i++){
			int y = arr[i].ti;
			while(y >= 0){
				if(maximos[y] == 0){
					maximos[y] = arr[i].ci;
					break;
				}
				y--;
		    }
		}
		int sum = 0;
		for (int i = 0; i < maximos.length; i++) {
			sum += maximos[i];
		} 
		System.out.println(sum);
	}

		  
	
}
