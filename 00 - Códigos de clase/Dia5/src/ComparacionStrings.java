
public class ComparacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Para detectar que dos strings son iguales si tienen los mismos caracteres
		//debemos usar siempre el método equals y no el operador ==
		
		String cadena = "hola";
		
		String cadena2 = "Hola";
		String cadena3 = new String("Hola");		
				
		boolean iguales = cadena.equals(cadena2);
		boolean iguales2 = cadena == cadena2;
		boolean iguales3 = cadena.equals(cadena3);
		boolean iguales4 = cadena == cadena3;
		
		System.out.println("Iguales: " + iguales);
		System.out.println("Iguales2 " + iguales2);
		System.out.println("Iguales3 " + iguales3);
		System.out.println("Iguales4 " + iguales4);				
	
	
    }

}
