package misClases;

public class Motor {

	private int cilindrada;
	private int nivelAceite;
	private int caballos;
	
	
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motor(int cilindrada, int nivelAceite, int caballos) {
		super();
		this.cilindrada = cilindrada;
		this.nivelAceite = nivelAceite;
		this.caballos = caballos;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(int nivelAceite) {
		this.nivelAceite = nivelAceite;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", nivelAceite=" + nivelAceite + ", caballos=" + caballos + "]";
	}
	
	
	
	
	
	
}
