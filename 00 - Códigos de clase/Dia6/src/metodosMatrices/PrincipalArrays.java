package metodosMatrices;

import java.util.Arrays;

public class PrincipalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[200];
		
		MetodosArrays.llenarMatriz(x);
		
		MetodosArrays.printar(x);
		
		MetodosArrays.llenarMatriz(x, 21);
		
		MetodosArrays.printar(x);
		
		double media = MetodosArrays.mediaMatriz(x);
		
		//Prueba método suma con parámetros opcionales:
		
		int res1 = ParametrosOpcionales.suma(3);
		int res2 = ParametrosOpcionales.suma(3,4);
		int res3 = ParametrosOpcionales.suma(2,6,5,4,3,2,1,8,7,5,3,2,1);
		
		
		
		
		
		
		
	}

}
