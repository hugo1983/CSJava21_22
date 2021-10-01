package ejemplosArrays;

public class DeclaracionMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaraci�n de un array de enteros:
		int m[] = new int[10];
		//Para acceder a las diferentes posiciones de un array , usamos un �ndice
		//La primera pos le corresponde el �ndice 0.
		
		m[0] = 4;
		m[1] = 3;
		m[2] = 9;
		
		int otroValor = m[2];
		
		System.out.println(m[0]+ " " + m[1] + " " + m[2] + " " + m[3] + " " + m[4] + " ");
		
		//Declarar array e inicializar a unos valores
		float []temperaturas = {5.6f,9.87f,12.65f,34.4f};
		byte valores[] = {1,2,3,4,5,6};
		
		//Propiedad length: n�mero de elementos de un array
		int capacidad1 = m.length;
		int ultimoIndiceAccesible = m.length - 1;
		
		//Mostrar �ltima temperatura registrada:
		System.out.println("�ltima temperatura: " + temperaturas[temperaturas.length - 1]);
		
	}

}
