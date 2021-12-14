
public class Triangulo extends Poligono {

	private float altura;
	
	public Triangulo(float longitudLado,float altura) {
		super("Triangulo",3,longitudLado);
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + " " + super.toString() + "]";
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area = (getLongitudLado()*altura)/2;
	}
	
	
}
