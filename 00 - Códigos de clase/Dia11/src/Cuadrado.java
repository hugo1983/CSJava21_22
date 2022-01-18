
public class Cuadrado extends Poligono {

	public Cuadrado(float longitud) {
		super("Cuadrado",4,longitud);
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area = super.getLongitudLado()*super.getLongitudLado();
		
	}
	
	
}
