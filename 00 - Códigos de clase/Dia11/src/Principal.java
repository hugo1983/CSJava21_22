import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		Figura[] misFiguras = new Figura[5];
		
		misFiguras[0] = new Circulo(4);
		misFiguras[1] = new Cuadrado(5);
		misFiguras[2] = new Triangulo(8,3);
		misFiguras[3] = new Circulo(7);
		misFiguras[4] = new Circulo(3);
		
		
		//Quiero calcular el área de todas las figuras.
		
		for(Figura f : misFiguras) {
			if(f!=null) {
				f.calcularArea();
				f.calcularPerimetro();
			}
		}
		
		//Mostrar info de todas las figuras
		for(Figura f : misFiguras) {
			if(f!= null) {
				System.out.println(f);
			}
		}
		
		//Aumentar el radio de los circulos en 10 unidades
		
		for(Figura f : misFiguras) {
			if(f instanceof Circulo) {
				//((Circulo)f).setRadio(((Circulo)f).getRadio()+10);
				Circulo c = (Circulo)f;
				c.setRadio(c.getRadio()+ 10);
			}
		}
		System.out.println("Mostramos sólo los círculos: ");
		for(Figura f : misFiguras) {
			if(f instanceof Circulo) {
				System.out.println(f);
			}
		}
		
		System.out.println(misFiguras[1].compareTo(misFiguras[0]));
		
		Arrays.sort(misFiguras);
		Arrays.sort(misFiguras,new Comparator<Figura>(){

			@Override
			public int compare(Figura o1, Figura o2) {
				// TODO Auto-generated method stub
				Float p1 = o1.getPerimetro();
				Float p2 = o2.getPerimetro();
				return p1.compareTo(p2);
			}
			
		});
		
		System.out.println("Figuras ordenadas por area de menor a mayor:");
		
		for(Figura f : misFiguras) {
			System.out.println(f);
		}
		
	}
}
