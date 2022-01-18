
public class Piso implements Areable {

	float superficieHabitacion;
	float superficieBanho;
	int planta;
	int numeroHabitaciones;
	int numeroBanhos;
	float area;
	
	public Piso(float superficieHabitacion, float superficieBanho, int planta, int numeroHabitaciones,
			int numeroBanhos) {
		super();
		this.superficieHabitacion = superficieHabitacion;
		this.superficieBanho = superficieBanho;
		this.planta = planta;
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBanhos = numeroBanhos;
	}
	public float getSuperficieHabitacion() {
		return superficieHabitacion;
	}
	public void setSuperficieHabitacion(float superficieHabitacion) {
		this.superficieHabitacion = superficieHabitacion;
	}
	public float getSuperficieBanho() {
		return superficieBanho;
	}
	public void setSuperficieBanho(float superficieBanho) {
		this.superficieBanho = superficieBanho;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	public int getNumeroBanhos() {
		return numeroBanhos;
	}
	public void setNumeroBanhos(int numeroBanhos) {
		this.numeroBanhos = numeroBanhos;
	}
	public float getArea() {
		return area;
	}
		
	  public void calcularArea() { 
		  area = numeroHabitaciones*superficieHabitacion +
	  numeroBanhos*superficieBanho; 
		  }
	 
	

	
	
	
}
