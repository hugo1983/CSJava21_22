package ejemploBucleFor;

public class Ejemplo2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Algoritmo que cuenta los divisores de un n�mero:
		
		int numero = 121;
		//Todos los n�meros son divisibles entre 1 y ellos mismos
		int contador = 2;
		//Bucle entre 2 y numero - 1
		
		for(int i = 2;i<=numero/2;i++) {
			if(numero % i == 0) {				
				contador++;
				break;
			}
		}
		System.out.println(numero + " tiene : " + contador + " divisores.");
		//Detectar si un n�mero es primo: si solo tiene dos divisores
		
		if(contador == 2) {
			System.out.println("N�mero primo.");
		}
		else {
			System.out.println("N�mero no primo");
		}
		
	}

}
