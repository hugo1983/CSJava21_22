package bucles;

import java.util.Arrays;
import java.util.Random;

public class BucleWhileBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz = new int[30];
		Random generador = new Random();
		int maximo = matriz.length;
		
		int i = 0;
		while(i<maximo) {
			matriz[i] = generador.nextInt(20);
			
			i++;
		}
		
		//Encontrar la primera posición que almacena un cero:
		
		
		int posicion = -1; //Valor absurdo , no puede haber posiciones con índice negativo
		
		int j = 0;
		
		while(j<maximo) {
			if(matriz[j]==0) {
				posicion = j;
				System.out.println(j + " tiene un cero.");
				break; //Salir precipitadamente del bucle
			}
			
			j++;
		}
		
		if(posicion == -1) {
			System.out.println("No hay ceros en la matriz");
		}
		
		//Continue
		
		//Mostrar todas las posiciones , menos las que tengan un cero
		
		System.out.println(Arrays.toString(matriz));
		j = 0;
		int matriz2[] = {1,0,2};
		System.out.println("Posiciones que no tienen ceros:");
		while(j<matriz2.length) {
			
			if(matriz2[j]==0) {
				++j;
				continue;
				
			}
			System.out.print(j + " ");
			j++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
