package sentenciasSeleccion;
import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Solicitar al usuario un número entre 10 y 50 y que sea impar
		int numero;
		boolean condicion = false;
		int numeroIntentos = 0;
		
		do {
		
				Scanner lector = new Scanner(System.in);
				System.out.println("Introduce un número impar entre 10 y 50 ");
				numero = lector.nextInt();
				
				if(numero>=10 && numero <=50 && numero % 2 !=0) {
					System.out.println("Has acertado!!");
					condicion = true;
				}
				else {
					System.out.println("No has acertado.");
					condicion = false;
					//numeroIntentos = numeroIntentos + 1;
					//numeroIntentos++;
					numeroIntentos+=1;
					
				}
				
				
		} //Final del bucle do
		while(!condicion && numeroIntentos<3);
	} // Fin del método main
	

} //Final de la clase
