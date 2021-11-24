package metodosMatrices;

public class ParametrosOpcionales {

	//Método que recibe n variables de tipo int y devuelve la suma
	
	public static int suma(int... x) {
		int resultado = 0;
		for(int valor : x) {
			resultado+=valor;
		}
		
		return resultado;
		
	}
	
}
