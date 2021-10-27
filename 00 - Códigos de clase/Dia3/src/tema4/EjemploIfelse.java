package tema4;

import java.util.Scanner;

public class EjemploIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca la edad;");
		edad = lector.nextInt();
		
		if(edad<18) {
			if(edad>15) {
				System.out.println("Menor de edad,pero mayor de 15!");
			}
			else {
				System.out.println("Menor de edad,pero menor de 15!");
			}
			
		}
		else {
			System.out.println("Mayor de edad!");
		}
		
	}

}
