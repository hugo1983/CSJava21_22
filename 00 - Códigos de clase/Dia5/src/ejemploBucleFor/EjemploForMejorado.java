package ejemploBucleFor;

public class EjemploForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For mejorado se utiliza para recorrer matrices en modo lectura.
		//Sintaxis: for(<tipo variable> nombre : matriz)
		int[] x = {4,5,6,7,3,1,2,3,9,8,0,9};
		
		
		//Mostrar por pantalla la matriz
		for(int valor : x) {
			System.out.print(valor + " ");
		}
		
		//Calcular la media
		int suma = 0;
		double media = 0;
		for(int valor : x) {
			suma+=valor;
		}
		
		media = suma/x.length;
		//Poner todas las posiciones que almacenan un número par a cero
		
		for(int valor : x) {
			if(valor%2 == 0) {
				valor = 0;
			}
			
		}		
		
		System.out.println("Matriz después de poner valores pares a cero:");
		for(int valor : x) {
			System.out.print(valor + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
