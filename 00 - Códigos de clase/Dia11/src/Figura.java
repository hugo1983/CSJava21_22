
public abstract class Figura implements Areable,Comparable<Figura> {

	private String nombre;
	protected float area;
	protected float perimetro;
	
	public Figura() {
		
	}
	
	public Figura(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", area=" + area + " perímetro: " + this.perimetro;
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		Float f1 = this.area;
		Float f2 = o.area;
		return f1.compareTo(f2);
	}

	public float getPerimetro() {
		return perimetro;
	}
	
	public abstract void calcularPerimetro();
	
}
