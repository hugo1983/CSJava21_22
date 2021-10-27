package ejemplosMatrices2D;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 5 6
		// 9 2 7 1
		// 0 9 3 2 8
		int[][] matriz2D = new int[3][4];
		matriz2D[0][2]= 9;
		
		int[][] x2 = {{1,3,5,6},{9,2,7,1},{0,9,3,2,8}};
		
		
		//Propiedad length en matrices 2D --> devuelve el número de filas
		int filas = x2.length;
		System.out.println("Filas : " + filas);
		
		int columnas = x2[0].length; //Número de columnas de la fila cero.
		int columnas2 = x2[2].length; //Número de columnas de la fila dos
		
		System.out.println(columnas);
		System.out.println(columnas2);
		
		//Mostrar por pantalla una matriz 2D
		
		
		for(int i = 0;i<x2.length;i++) {
			for(int j = 0;j<x2[i].length;j++) {
				System.out.print(x2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//Suma de los elementos de x2
		int suma = 0;
		
		for(int i = 0;i<x2.length;i++) {
			for(int j = 0;j<x2[i].length;j++) {
				suma+=x2[i][j];
			}
		}
		
		//Calcular la media de la primera fila
		
		int suma1 = 0;
		double media1 = 0;
		
		for(int i = 0;i<x2[0].length;i++) {
			suma1+= x2[0][i];
		}
		
		media1 = suma/x2[0].length;
		
		
	}

}
