package ejemploEnvoltorios;

import java.io.BufferedReader;

public class EnvoltoriosNumericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Por cada variable primitiva , el Api de Java aporta una variable compleja
		//int --> Integer
		//float --> Float
		//double --> Double
		
		int numero = 95;
		
		
		String numeroCadena = Integer.toString(numero);
		String numeroDecimal = Float.toString(4.56f);
		
		String dni="12345678P";
		String dniNumero = dni.substring(0,8);
		long dniNumerico = Long.parseLong(dniNumero);
		int dniNumerico2 = Integer.parseInt(dniNumero);
		
	}

}
