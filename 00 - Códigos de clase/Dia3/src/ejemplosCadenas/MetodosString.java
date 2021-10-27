package ejemplosCadenas;

import java.util.Arrays;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Soy una cadena";
		
		//length--> Me devuelve el número de caracteres
		int numCaracteres = cadena.length();
		
		//charAt(int posicion)--> Caracter que ocupa esa posición
		char caracterPosicionCero = cadena.charAt(0);
		
		//Quiero obtener el último caracter
		try {
			char ultimoCaracter = cadena.charAt(cadena.length()-1);
			//char ultimoCaracter = cadena.charAt(cadena.length());
		}
		catch(Exception ex) {
			System.out.println("No se ha podido realizar el cálculo");
		}
		
		System.out.println("Continuamos para bingo...");
		
		//indexOf(char c)--> Me devuelve la posición que ocupa ese caracter
		int posicionPrimerEspacio = cadena.indexOf(" ");
		System.out.println("El primer espacio está en la pos: " + posicionPrimerEspacio);
		int posicionSegundoEspacio = cadena.indexOf(" ",cadena.indexOf(" ")+1);
		System.out.println("Posicion segundo espacio: " + posicionSegundoEspacio);
		
		//lastIndexOf --> Empieza a buscar por el último caracter.
		
		//substring() --> Extrae una subcadena de un string
		
		String subCadena = cadena.substring(4);
		System.out.println(subCadena);
		
		String subCadena2 = cadena.substring(0, 4);
		System.out.println(subCadena2);
		
		//split(" ")--> Trocea el string original a partir del caracter que recibe como argumento
		
		String[] palabras = cadena.split("u");
		
		System.out.println("Troceado con splitt");
		System.out.println(Arrays.toString(palabras));
		
		//System.out.println(palabras[1].charAt(0));
		
		//equals --> Sirve para comrobar si dos strings almacenan los mismos caracteres
		String x = "Hola";
		String y = "Hoa";
		boolean iguales = x.equals(y);
		System.out.println(iguales);
		
		//compareTo --> negativo,0,positivo
		String cadena1 = "Alejandro";
		String cadena2 = " ";
		System.out.println(cadena1.compareTo(cadena2));
		
		String original = " Esta cadena tiene espacio al inicio y al final ";
		original = original.trim();
		System.out.println(original);
		
		//Cuántas palabras tiene un String
		
		int numPalabras = original.split(" ").length;
		
	}

}
