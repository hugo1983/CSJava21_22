package ejemploBucleFor;

public class Ejemplo1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bucle for
		
		//Programa que muestra los 10 primeros n�meros por pantalla
		//sintaxis--> for(inicializaci�n;condici�n de continuidad;incremento)
		int i = 0;
		
		for(i=1;i<=10;i=i+1) {
			System.out.print(i + " ");
		}
		
		for(i=1;i<=10 && i%2==0 && i%3 ==0;i=i+1) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("La variable i sale del bucle con valor: " + i);
		
		//Declaraci�n e inicializaci�n de la variable de control dentro del bucle for
		
		for(int j = 0;j<=10;j+=1) {
			
		}
		
		for(int j = 0;j<=10;j+=1) {
			
		}
	}

}
