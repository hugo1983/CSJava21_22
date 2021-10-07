package ejemplosLecturaDatos;
import java.util.Scanner;

import javax.swing.*;

public class PanelConCajaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			byte edad = Byte.parseByte(JOptionPane.showInputDialog("Introduzca su edad: "));
			System.out.println(edad);
			String valor= "Hola";
			valor.charAt(8);
		
		}
		catch(NumberFormatException n) {
			System.out.println("El valor introducido es erróneo");
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			//System.out.println("Se ha producido un error desconocido");
		}
		
		String iban;
		System.out.println("Introduzca número de lector:");
		
		Scanner lector = new Scanner(System.in);
		iban = lector.next();
	}

}
