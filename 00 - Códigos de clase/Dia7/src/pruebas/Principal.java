package pruebas;
import repasoMetodos.*;
import boletinRepaso.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prueba M�todo esPerfecto
		
		int numero = 28;
		
		
		if(MTDNumeros.esPerfecto(numero)) {
			System.out.println("N�mero perfecto.");
		}
		else {
			System.out.println("N�mero no perfecto");
		}
		
		int[] matriz = new int[1200];
		
		//Probar Metodo esPerfecto sobre 50 n�meros
		
		MTDNumeros.llenarMatriz(matriz, 500);
		
		System.out.println("Los n�meros perfectos de la matriz son: ");
		
		for(int valor: matriz) {
			
			if(MTDNumeros.esPerfecto(valor))
					System.out.print(valor + " ");
		}
		
		
		
		//N�meros perfectos por debajo de 10000
		System.out.println();
		System.out.println("N�meros perfectos por debajo de 10000");
		for(int i = 6;i<=10000;i++) {
			if(MTDNumeros.esPerfecto(i)) {
				System.out.print(i + " ");
			}
		}
		
		//Prueba m�todo resistencia equivalente
		
		float r1 = 4,r2 = 7;
		try {
			float rEquivalenteOhmnios = MTDNumeros.getResistenciaEquivalente(r1, r2,9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error , no se ha podido calcular");
		}
		try {
			float rEquivalenteKiloOhmnios = MTDNumeros.getResistenciaEquivalente(r1, r2, 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error , no se ha podido calcular");
		}
		
		// 4 5 6
		// 9 0 8
		// 4 5 6
		
		
		/*
		 * if(rEquivalenteKiloOhmnios == -1) {
		 * System.out.println("Error , no se ha podido calcular"); } else {
		 * System.out.println("Resistencia equivalente: " + rEquivalenteKiloOhmnios); }
		 */
		
		
		
		
		
		
		
		
		
	}

}
