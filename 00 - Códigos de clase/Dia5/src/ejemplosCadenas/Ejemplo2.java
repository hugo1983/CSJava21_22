package ejemplosCadenas;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cadenas = new String[5];
		int posicion = -1;
		cadenas[0] = "Pablo";
		cadenas[1] = "Juan";
		
		//Comprobar la primera posición que está vacía.
		
		for(int i = 0;i<cadenas.length;i++) {
			if(cadenas[i]==null) {
				posicion = i;
				break;
			}
		}
		
		if(posicion == -1) {
			System.out.println("No hay posiciones vacías.");
		}
		else {
			System.out.println("Primera posición vacía: " + posicion);
		}
		
		
		
	}

}
