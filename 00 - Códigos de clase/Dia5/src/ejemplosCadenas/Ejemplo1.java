package ejemplosCadenas;

import java.util.StringTokenizer;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "El Real Madrid se lleva el clásico una vez más";
		//Contar cuantas veces aparece la letra a.
		int contador = 0;
		
		for(int i = 0;i<frase.length();i++) {
			if(frase.charAt(i)=='a') {
				contador++;
			}
		}		
		
		//Contar cuantas mayúsculas tiene la frase
		int contadorMayusculas = 0;
		int j = 0;
		while(j<frase.length()) {
			if(Character.isUpperCase(frase.charAt(j))) {
				contadorMayusculas ++;
			}
			j++;
		}
		
		//Contar cuantas palabras empiezan por mayúscula
		String[] palabras = frase.split(" ");
		//StringTokenizer tokens = new StringTokenizer(frase);
		
		for(int i = 0;i<palabras.length;i++) {
			if(Character.isUpperCase(palabras[i].charAt(0))) {
				
			}
		}
		
		//Mostrar por pantalla palabras que empiezan por m
		for(int i = 0;i<palabras.length;i++) {
			if(palabras[i].startsWith("m") || palabras[i].startsWith("M")) {
				System.out.println(palabras[i]);
			}
		}
		
	}

}
