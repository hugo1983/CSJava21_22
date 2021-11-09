package metodosConRetorno;

import metodosVoid.MisMetodosSinRetorno;

public class Principal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 90;
		
		int resultadoSumaDivisores = MisMetodosConRetorno.sumaDivisores(num);
		
		System.out.println("Suma divisores : " + num + " = " + resultadoSumaDivisores);
		System.out.println("Suma divisores de 190 = " + MisMetodosConRetorno.sumaDivisores(190));
		
		
		int[] matriz = {6,4,5,6,7,13,9,11,23,8,6,4,2,9};
		
		//Mostrar por pantalla los números primos
		System.out.println("número primos: ");
		for(int valor : matriz) {		
			
			if(MisMetodosConRetorno.esPrimo(valor)) {
				System.out.print(valor + " ");
			}
		}
		
		
		//Prueba del método suma10
		int n = 90;
		System.out.println("Prueba del método suma10: ");
		System.out.println(MisMetodosConRetorno.suma10(n));
		System.out.println("n = " + n);
		
		System.out.println();
		
		MisMetodosSinRetorno.suma10(n);
		n = MisMetodosConRetorno.suma10(n);
		
		System.out.println("n = " + n);
		
		//Prueba de la sobrecarga del método suma10
		
		double d = 56.89;
		
		d = MisMetodosConRetorno.suma10(d);
		
		int resultado1 = MisMetodosConRetorno.suma(3, 4);
		int resultado2 = MisMetodosConRetorno.suma(3, 2,1);
		
		
	
		String cadena = "Esto es impresionante , estoy aprendiendo muchísimo!";
		
		String s = cadena.substring(12,16);
		
		
		
		
		
		
		
	}

}
