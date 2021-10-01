package ejemplosMath;


import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double aleatorio = Math.random(); //Genera un número aleatorio entre 0 y 1
		//0.234 , 0.4532
		
		System.out.println("Aleatorio: " + aleatorio);
		
		for(int i = 0;i<20;i++) {
			System.out.print((int)Math.floor(Math.random()*10)+" ");
		}
		
		System.out.println();
		
		System.out.println("Números generados con Random: ");
		Random rd = new Random();
		
		for(int i = 0;i<10;i++)
		System.out.print(rd.nextInt(50) + " ");
		

		
		
		
	}

}
