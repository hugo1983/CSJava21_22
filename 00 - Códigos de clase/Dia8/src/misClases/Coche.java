package misClases;

public class Coche {

	private String matricula;
	private float precio;
	private Motor m;
	private Rueda r;
	
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, float precio, Motor m,String marcaRuedas,float aire,float diametro) {
		super();
		this.matricula = matricula;
		this.precio = precio;
		this.m = m;
		r = new Rueda(diametro, marcaRuedas, diametro);
	}
	//Constructor que reciba las características de un motor
	
	public Coche(String matricula, float precio,int cilindrada,int nivelAceite,int caballos) {
		this.matricula = matricula;
		this.precio = precio;
		this.m = new Motor(cilindrada,nivelAceite,caballos);
	}
	


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public Motor getM() {
		return m;
	}


	public void setM(Motor m) {
		this.m = m;
	}
	

	public Rueda getR() {
		return r;
	}

	public void setR(Rueda r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", precio=" + precio + ", m=" + m + "]";
	}
	
	
	public class Rueda{
		float nivelAire;
		String marca;
		float diametro;
		
		
		
		public Rueda(float nivelAire, String marca, float diametro) {
			super();
			this.nivelAire = nivelAire;
			this.marca = marca;
			this.diametro = diametro;
		}
		public float getNivelAire() {
			return nivelAire;
		}
		public void setNivelAire(float nivelAire) {
			this.nivelAire = nivelAire;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public float getDiametro() {
			return diametro;
		}
		public void setDiametro(float diametro) {
			this.diametro = diametro;
		}
		
		
	}
	
	
}
