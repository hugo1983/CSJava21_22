import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Math.sin(Math.toRadians(90)));
		
		double valor = 5.67683820;
		
		double valor2 = (double)Math.round(valor * 100) / 100;
		
		
		DecimalFormat f = new DecimalFormat("#.##");
		
		System.out.println(valor2);
		System.out.printf("Valor: %.2f \n", valor );
		System.out.println(f.format(valor));
		
	}

}
