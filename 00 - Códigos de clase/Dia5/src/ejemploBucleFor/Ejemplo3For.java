package ejemploBucleFor;

import java.util.Random;

public class Ejemplo3For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Trabajar con matrices
		int[] matriz = new int[50];
		int contador = 0;
		
		Random generator = new Random();
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = generator.nextInt(200);		
			
		}
		
		//Contar cuantos valores son múltiplos de 2 y 7
		for(int i =0;i<matriz.length;i++) {
			if(matriz[i]%2==0 && matriz[i]%7==0) {
				contador++;
			}					
		}
		
		
		
	}

}
