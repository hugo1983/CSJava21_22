package metodosVoid;

import java.util.Arrays;

import metodosConRetorno.MisMetodosConRetorno;

public class Principal {

	public static void printar(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printar("Esto es divertid�simo");
		
		int[] matriz = {4,3,2};
		Arrays.sort(matriz); //Ejemplo funci�n tipo void
		
		int[] matriz2 = Arrays.copyOf(matriz, matriz.length);
		
		
		
		
	}

}
