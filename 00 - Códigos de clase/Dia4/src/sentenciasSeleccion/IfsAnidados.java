package sentenciasSeleccion;
import java.util.Arrays;

public class IfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que detecte n�mero par > 100
		int numero = 125;
		
		if(numero > 100) {
			if(numero % 2 == 0) {
				System.out.println("Par y > 100");
			}
			else {
				System.out.println("N�mero > 100 impar");
			}
		} //Cierra el primer If
		else {
			System.out.println("N�mero < 100");
		}
		
		
	}

}
