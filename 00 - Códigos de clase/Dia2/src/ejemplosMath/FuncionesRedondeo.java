package ejemplosMath;

import java.text.DecimalFormat;

public class FuncionesRedondeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor = 9.587658;
		
		int valor1 = (int) Math.floor(valor);
		System.out.println("Valor redondeado a entero por abajo: " + valor1);
		
		int valor2 = (int) Math.ceil(valor);
		System.out.println("Valor redondeado a entero por arriba: " + valor2);
		
		int valor3 = (int) Math.round(valor);
		
		System.out.println("Valor redondeado a entero más cercano: " + valor3);
		
		
		//Redondear a un número de decimales: Por a ejemplo a 2
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println(valor + " con 2 decimales: " + df.format(valor));
		
		//Otra forma es con el método printf
		System.out.printf("Con dos decimales: %.2f ,con tres: %.3f \n", valor,valor);
		
		//Otra forma más sencilla: Math.round
		double valorRedondeadoAdos = (double)Math.round(valor*1000)/1000;
		
		
		
		System.out.println("Math.round(valor*100)= " + Math.round(valor*100));
		
		System.out.println("Math.round(valor*100)/100 = " + valorRedondeadoAdos);
	}

}
