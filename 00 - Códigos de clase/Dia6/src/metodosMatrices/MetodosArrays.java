package metodosMatrices;

import java.util.Random;

public class MetodosArrays {

	
	public static void llenarMatriz(int[] m) {
		Random r = new Random();
		
		for(int i = 0;i<m.length;i++) {
			m[i] = r.nextInt();
		}
	}
	
	public static void llenarMatriz(int[] m,int limite) {
		Random r = new Random();
		
		for(int i = 0;i<m.length;i++) {
			m[i] = r.nextInt(limite);
			
		}
		
	}
	
	
	public static void llenarMatriz(int[] m,int limiteInferior,int limiteSuperior) {
		Random r = new Random();
		
		for(int i = 0;i<m.length;i++) {
		//	m[i] = r.nextInt(limite);
			
		}
		
	}
	
	
	public static void llenarMatriz(float[] m) {
		Random r = new Random();
		
		for(int i = 0;i<m.length;i++) {
			m[i] = r.nextFloat();
			
		}
	}
	
	//Método que calcula la media de un array
	
	public static double mediaMatriz(int[] x) {
		int suma = 0;
		double media = 0;
		
		for(int valor : x) {
			suma+=valor;
		}
		
		media = suma/x.length;
		
		return media;
		
	}
	
	public static double mediaMatriz(int[][] x) {
		int suma = 0;
		double media = 0;
		
		/*
		 * for(int array[] : x) { 
		 * 		for(int valor : array) { 
		 * 		suma+=valor;
		 *  	} 
		 *  }
		 */
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
				suma+=x[i][j];
			}
		}
		
		media = suma/x.length;
		
		return media;
		
	}
	
	
	
	
	
	
	public static void printar(int[] m) {
		for(int valor : m) {
			System.out.print(valor + " , ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
