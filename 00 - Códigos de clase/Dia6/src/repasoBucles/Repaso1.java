package repasoBucles;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Apartado a: Muestra n�mero pares	
			

		String[] matriz = new String[200];
		int posicion = -1;
		boolean encontrado = false;
		matriz[0] = "Pedro Gonz�lez";
		matriz[1] = "Luc�a P�rez";
		matriz[4] = "Sergio Sanchis";
		matriz[5] = "Maria Gul�as";
		
		
		
		//Algoritmo que me indique  la primera pos vac�a
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==null) {
				posicion = i;
				encontrado = true;
				break;
			}
			
		}
		
		if(!encontrado) {
			System.out.println("No hay posiciones vac�as.");
		}
		
		
		//Contar cuantos nombres acaban en o
		//
		int contador = 0;
		for(String cadena : matriz) {
			if(cadena!=null) {
			
				if(cadena.split(" ")[0].endsWith("o")) {
					
				}
			
		}
		
		
		}
	}

}
