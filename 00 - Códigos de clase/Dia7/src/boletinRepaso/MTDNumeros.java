package boletinRepaso;

import java.util.Random;

public class MTDNumeros {

	public static boolean esPerfecto(int x) {
		int suma = 0;
		boolean perfecto = false;
		//6 = 1 + 2 + 3
		//28 = 1 + 2 +  4 + 7 + 14
		int i = 1;
		
		while(i<x) {
			if(x%i==0) {
				suma+=i;
			}
			i++;
		} //Final del while
		
		if(suma == x && x > 0)
			perfecto = true;
		
		return perfecto;
		
	}
	
	//Método que llena una matriz con números aleatorios
	
	public static void llenarMatriz(int[] matriz,int limite) {
		Random generador = new Random();
		
		for (int i = 0;i<matriz.length;i++) {
			matriz[i] = generador.nextInt(limite);
		}
	}
	
	
	//Método que calcula resistencia equivalente
	public static float getResistenciaEquivalente(float r1,float r2,int...unidad) throws Exception {
		//Para saber si se ha pasado algún parámetro opciona
		float rEq = 0;
		int parametroOpcional = unidad.length;
		
		if(parametroOpcional == 0) {
			rEq = r1*r2/(r1 + r2);
			
		}
		else {
			if(unidad[0]==1) {
				rEq = r1*r2/(r1 + r2);
				rEq = (float)(rEq*Math.pow(10, 6));
			}
			else if(unidad[0]==2) {
				rEq = r1*r2/(r1 + r2);
				rEq = (float)(rEq*Math.pow(10, -3));
			}
			
			  else {
				  
				  rEq = -1;
				  
			  }
			 
			
		}
		
		return rEq;
		
		
	}
}
