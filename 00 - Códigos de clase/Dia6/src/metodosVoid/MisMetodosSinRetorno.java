package metodosVoid;

public class MisMetodosSinRetorno {

	//Método que muestra por consola un mensaje
	public static void printar(String mensaje) {
		System.out.println(mensaje);
	}
	
	//Método que suma 10 a la variable que recibe como parámetros
	
	public static void suma10(int x) {
		System.out.print(x + " + 10 = ");
		x = x + 10;
		System.out.println(x);
	}
	
}
