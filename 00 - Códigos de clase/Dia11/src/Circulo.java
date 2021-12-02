
public class Circulo extends Figura {

	private float radio;

	public Circulo() {
		
	}
	public Circulo( float radio) {
		super("Circulo");
		this.radio = radio;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]" + super.toString();
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area= (float)Math.PI*radio*radio;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		super.perimetro = (float)(2*Math.PI*radio);
	}

	
	
	

	
}
