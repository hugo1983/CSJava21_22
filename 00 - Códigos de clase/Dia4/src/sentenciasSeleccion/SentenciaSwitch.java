package sentenciasSeleccion;
import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		do {
			
			System.out.println("Escoja una opción: ");
			System.out.println("1. Calcular la raiz de un número.");
			System.out.println("2. Mostrar cuantos caracteres tiene un String");
			System.out.println("3. Salir del programa.");
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextInt();
		
		
		switch(opcion) {
		case 1:
			int numero;
			double raiz;
			System.out.println("Introduce número para calcular raiz:");
			
			numero = lector.nextInt();
			if(numero >= 0) {
				raiz = Math.sqrt(numero);
			}
			else {
				raiz = 0;
			}
			System.out.println("La raiz es: " + raiz);
			break;
		case 2:
				
			  String frase=""; System.out.println("Introduce una frase/palabra");
			  lector = new Scanner(System.in);
			  
			  frase = lector.nextLine();
			  System.out.println("Caracteres: " + frase.length());
			 
			break;
		case 3:
			System.out.println("Hasta luego");
			System.exit(0);
			break;
		default:
			System.out.println("Opción errónea.");
			break;
		
		} // Cierre del switch
		
		} //Cierro el do
		while(opcion<0 || opcion>3);
		
	}

}
