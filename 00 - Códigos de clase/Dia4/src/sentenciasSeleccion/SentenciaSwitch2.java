package sentenciasSeleccion;
import java.util.Scanner;

public class SentenciaSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a) Decir hola");
		System.out.println(("b) Decir Adios"));
		System.out.println("En cualquier otro caso Hala Celta");
		Scanner lector = new Scanner(System.in);
		
		char opcion = lector.next().charAt(0);
		
		
		switch(opcion) {
		case 'a':
		case 'A':
			System.out.println("Hola");
			break;
		case 'b':
		case 'B':
			System.out.println("Adios!");
			break;
		default:
			System.out.println("Hala Celta!");
		}
		

	}

}
