package ejemplosBuclesAnidados;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Los BuCles AniDAados SON fantásticos";
		
		//Mostar palabras que contienen más de 2 mayúsculas
		
		
		String []palabras = frase.split(" ");
		int contadorMayusculas = 0;
		
		for(int i = 0;i<palabras.length;i++) {
			//Recorrer palabras[i]
			contadorMayusculas = 0;
			for(int j = 0;j<palabras[i].length();j++) {
				if(Character.isUpperCase(palabras[i].charAt(j))){
					contadorMayusculas++;
				}
			}
			
			if(contadorMayusculas >2) {
				System.out.println(palabras[i]);
				
			}
		}
		
		
		
		
		
	}

}
