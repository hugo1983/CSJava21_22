package bucles;

import java.util.Arrays;
import java.util.Random;

public class BucleWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aleatorios = new int[55];
		int maximo = aleatorios.length;
		Random generador = new Random();
		
		int i = 0;
		while(i<maximo) {
			aleatorios[i] = generador.nextInt(20);
			
			i++;
		}
		
		//System.out.println(Arrays.toString(aleatorios));
		
		//Mostrar por pantallas aquellas posiciones que guarden un número > 10
		
		int j = 0;
		
		while(j<maximo) {
			if(aleatorios[j]>15) {
				System.out.println("Pos: " + j + ": " + aleatorios[j]);
			}
			j++;
		}
		
		//Mostrar las posiciones que almacenan un número > media.
		
		int suma = 0;
		double media, porcentaje;
		
	//	suma = aleatorios[0] + aleatorios[1] + aleatorios[2] + aleatorios[3] + ...
		
		j = 0;
		
		while(j<maximo) {
			suma = suma + aleatorios[j];
			j++;
		}
		
		media = suma/aleatorios.length;
			
		
		
		//Porcentaje de valores por debajo de la media.
		
		
	}

}
