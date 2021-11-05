package repasoBucles;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Apartado a: Muestra número pares	
			

		String[] matriz = new String[200];
		int posicion = -1;
		boolean encontrado = false;
		matriz[0] = "Pedro González";
		matriz[1] = "Lucía Pérez";
		matriz[4] = "Sergio Sanchis";
		matriz[5] = "Maria Gulías";
		
		
		
		//Algoritmo que me indique  la primera pos vacía
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==null) {
				posicion = i;
				encontrado = true;
				break;
			}
			
		}
		
		if(!encontrado) {
			System.out.println("No hay posiciones vacías.");
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
