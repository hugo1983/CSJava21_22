package pruebas;

import misClases.Coche;
import misClases.Motor;

public class PruebaMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor m1 = new Motor();
		Motor m2 = new Motor(234,70,500);
		
		System.out.println(m1);
		System.out.println(m2);
		
		//Dos tipos de relación entre objetos:
		//Composición: Objeto contiene otro objeto
		//Herencia: Objetos es/es cómo  otro objeto
		
		Coche c1 = new Coche("2345-GHN", 19000, m2,"Michelin",100,226);
		//Aumentar el nivel de aceite del motor de c1
		c1.getM().setNivelAceite(90);
		c1.getR().setMarca("Dunlop");
		m2.setCaballos(9000);
		System.out.println(c1);
		
		//Ejemplo 2do constructor
		Coche c2 = new Coche("1123-POI",23000,345,560,90);
		c2.getM().setCilindrada(90);
		System.out.println(c2);
		
		
		//Instanciación anónima
		
		Coche c3 = new Coche("1234-ERT",5000,new Motor(1000,300,500),"Michelin",50,90);
		
		
		
	}

}
