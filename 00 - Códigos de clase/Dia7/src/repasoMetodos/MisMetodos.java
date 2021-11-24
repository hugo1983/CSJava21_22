package repasoMetodos;

public class MisMetodos {

	//Métodos que devolvían algún tipo de dato
	public static int suma(int x,int y) {
		return x + y;
	}
	
	public static int getMaximo(int x,int y) {
		if(x<=y) {
			return y;
		}
		else {
			return x;
		}
	}
	
	public static int getMaximo(int x,int y ,int z) {
		return Math.max(x, Math.max(y, z));
	}
	
	//Las variables primitivas se pasan por valor
	
	public static int suma10(int x) {
		x = x + 10;
		return x;
	}
	
	//Las variables complejas u obketos se pasan por referencia
	
	public static void modificaMatriz(int[] x) {
		for(int i = 0;i<x.length;i++) {
			if(x[i] % 2 ==0) {
				x[i] = 0;
			}
		}
	}
	
	public void printarMatriz(int x[]) {
		for(int valor:x) {
			System.out.print(valor + " ");
		}
	}
	
	
	public void imprime(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	
}
