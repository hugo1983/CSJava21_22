
public abstract class Poligono extends Figura {

	private int numeroLados;
	private float longitudLado;
	
	
	public Poligono(String nombre,int numeroLados,float longitudLado) {
		super(nombre);
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
	}


	public int getNumeroLados() {
		return numeroLados;
	}


	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}


	public float getLongitudLado() {
		return longitudLado;
	}


	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}


	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + ", longitudLado=" + longitudLado + "]" + super.toString();
	}
	
	@Override
	public void calcularPerimetro() {
		super.perimetro = this.numeroLados*this.longitudLado;
	}
	
}
