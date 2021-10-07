package ejemplosLecturaDatos;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int valor1;
		System.out.println("Introduzca un valor: ");
		valor1 = lector.nextInt();
		
		System.out.println("Valor1 = " + valor1);
		
		System.out.println("Introduzca un segundo valor: ");
		int valor2 = lector.nextInt();
		System.out.println("Valor2 = " + valor2);
		
		System.out.println("Introduzca su nombre: ");
		//lector = new Scanner(System.in);
		String nombre = lector.next();
		System.out.println("Nombre = " + nombre);
		
		float precio;
		System.out.println("Introduzca el precio: ");
		precio = lector.nextFloat();
		
		
		
	}

}
