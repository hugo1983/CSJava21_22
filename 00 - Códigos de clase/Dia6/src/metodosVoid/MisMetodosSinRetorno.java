package metodosVoid;

public class MisMetodosSinRetorno {

	//M�todo que muestra por consola un mensaje
	public static void printar(String mensaje) {
		System.out.println(mensaje);
	}
	
	//M�todo que suma 10 a la variable que recibe como par�metros
	
	public static void suma10(int x) {
		System.out.print(x + " + 10 = ");
		x = x + 10;
		System.out.println(x);
	}
	
}
