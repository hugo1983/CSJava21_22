package ejemplosCadenas;


public class ExplicacionInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays de caracteres --> String
		//Almacenar caracteres alfanuméricos --> dni,teléfono,codigo postal
		String codigoPostal = "36708";
		String codigoPostal2 = new String("36708");
		
		//String son inmutables-->No se puede modificar.
		//Replace-->Recibe caracter viejo y caracter nuevo
		String frase = "En un lugar de la Mancha";
		//StringBuilder sB = new StringBuilder("Me gusta cambiar");
		
		frase = "Soy otro completamente nuevo. Me siento bien";
		// Si quiero modificar el String original
		frase=frase.replace(' ', '_');
		
		System.out.println(frase);
		
		
		
	}

}
