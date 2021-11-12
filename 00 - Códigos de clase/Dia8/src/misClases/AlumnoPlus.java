package misClases;

import java.util.Arrays;

public class AlumnoPlus {

	//Atributos de la clase , de instancia
	private String dni;
	private String nombre;
	private int edad;
	private float[] notas;
	private double media;
	private final static String centroEducativo = "Montecastelo";
	public static int contador;
	
	//Constructores
	public AlumnoPlus() {
		super();
		notas = new float[5];
		for(int i = 0;i< notas.length;i++) {
			notas[i] = -1;
		}
		contador++;
	}
	
	public AlumnoPlus(String dni) throws Exception {
		super();
		setDni(dni);
		notas = new float[5];
		for(int i = 0;i< notas.length;i++) {
			notas[i] = -1;
		}
		contador++;
		
	}
	
	//Sobrecargar el constructor
	/*
	 * public AlumnoPlus(String dni, String nombre, int edad,int cantidadNotas)
	 * throws Exception { super();//No es necesario, es una llamada al constructor
	 * de la clase base setDni(dni); this.nombre = nombre; this.edad = edad;
	 * this.notas = new float[cantidadNotas]; }
	 */
	
	//Sobrecargar el constructor
		public AlumnoPlus(String dni, String nombre, int edad,int cantidadNotas)  {
			super();//No es necesario, es una llamada al constructor de la clase base
			this.dni = dni;
			this.nombre = nombre;
			this.edad = edad;
			this.notas = new float[cantidadNotas];
			for(int i = 0;i< notas.length;i++) {
				notas[i] = -1;
			}
			contador++;
		}
	
	//Métodos de acceso
	
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) throws Exception {
		//Vamos a suponer que un dni es correcto si tiene 9 caracteres
		if(dni.length() == 9) {
			this.dni = dni;
		}
		else {
			throw new Exception("Error en el dni");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
		//Método guardar nota
	//Guardar una nota en un alumno
	public boolean guardarNota(float nota) {
		boolean correcto = false;
			if(nota>=0 && nota <=10) {
				correcto = true;
				for(int i = 0;i<notas.length;i++) {
					if(notas[i]==-1) {
						notas[i] = nota;
						break;
					}
				}
			
			//Actualizase la media
			actualizarMedia();
			
			}
			return correcto;
		}	
		
		private void actualizarMedia() {
			float suma = 0;
			int contador = 0;
			for(float nota : notas) {
				if(nota>-1) {
				suma+=nota;
				contador++;
				}
			}
			media = suma/contador;
		}			

		public float[] getNotas() {
			return notas;
		}

		public void setNotas(float[] notas) {
			this.notas = notas;
		}
		
		public static String getCentroEducativo() {
			return centroEducativo;
		}

//		public static void setCentroEducativo(String centroEducativo) {
//			AlumnoPlus.centroEducativo = centroEducativo;
//		}

		@Override
		public String toString() {
			return "[dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notas="
					+ Arrays.toString(notas) + ", media=" + media + "]";
		}
	
	
	  //Método que compara dos alumnos y devuelve el que tiene la media más alta
		public static AlumnoPlus getAlumnoConMediaAlta(AlumnoPlus a1,AlumnoPlus a2) {
			if(a1.media > a2.media) {
				return a1;
			}
			else {
				return a2;
			}
		}
	
}
