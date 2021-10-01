package ejemplosArrays;

import java.util.Arrays;

public class ClaseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejemplos Clase Arrays.
		int[] array1 = {7,3,4,5,1,2,0,9};
		String[] nombres = {"Juan","Pedro","Lucía","Zacarías","Bruno","Almudena"};
		
		//Mostrar el array por pantalla
		String mensaje = Arrays.toString(array1);
		System.out.println(Arrays.toString(array1));
		
		//Ordenar valores del array de menor a mayor
		Arrays.sort(array1);
		Arrays.sort(nombres);
		
		System.out.println("Después de usar el metodo sort:");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(nombres));
		
		//Búsqueda de un valor: BinarySearch--> Necesario Array Ordenado y recomendable valores únicos
		byte byteArr[] = {10,20,35,15,22,35,35,35,35,35,35,35}; //10,15,20,22,35,35,35
		int intArr[] = {10,20,15,22,35,6};  //6,10,15,20,22,35
		
		Arrays.sort(byteArr);
		Arrays.sort(intArr);
		
		int posicion35 = Arrays.binarySearch(intArr,35);
		System.out.println("Valor 35 en posición: " + posicion35);
		System.out.println("Valor 13 en posición: " + Arrays.binarySearch(intArr, 13));
		
		//Búsqueda del valor 35 en byteArr
		int posicion35enbyteArr = Arrays.binarySearch(byteArr,(byte)35);
		System.out.println("Posicion 35 en byteArr :" + posicion35enbyteArr);
		
		
		//Hacer una copia de un array:
		int[] original = {4,5,1,0,9,6};
		int[] copia= {2,3,2,1,0,4};
		
		
		/*
		 * int x = 9; int y = x; y = y + 1;
		 */
		
		//copia = original; Warning !!!!!
		
		//copia[0] = -5;
		
		//System.out.println("Original[0] = " + original[0]);
		
		//copia[0] = original[0];
		//copia[1] = original[1];
		
		copia = Arrays.copyOf(original, original.length-1);
		
		System.out.println("Valores en Array llamado copia: ");
		System.out.println(Arrays.toString(copia));
		
		//Si quiero copiar los dos últimos valores.
		
		copia = Arrays.copyOfRange(original, original.length-1, original.length);
		
		System.out.println("Valores en Array llamado copia: ");
		System.out.println(Arrays.toString(copia));
		
		//Arrays.equals ---> Devuelve true si dos arrays son iguales
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		
		System.out.println("Son iguales a1 y a2? : " + Arrays.equals(a1, a2));
		
		
		
		System.out.println("Son iguales a1 y a2? :  " + a1.equals(a2));
		
		//Clase Object --> Clase Base de todas las clases complejas de Java
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}

}
