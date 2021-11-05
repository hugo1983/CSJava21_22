package objetos1;

public class Alumno {
	
	//Atributos de la clase alumno:
	
	String dni;
	String nombre;
	int edad;
	float[] notas;
	double media;
	
	//Constructores: Métodos especiales que permiten instanciar objetos de la clase
	//Se distinguen de otros métodos porque: no tienen tipo de retorno y se tienen que llamar exactamente igual que la clase
	
	public Alumno() {
		//media = 0;
		//edad = 0;
		//nombre = null;
		//dni = null;
		notas = new float[5];
		notas[0] = -1;
		notas[1] = -1;
		notas[2] = -1;
		notas[3] = -1;
		notas[4] = -1;
	}
	
	
	//Métodos de la clase Alumno :
	
	//Guardar una nota en un alumno
	public void guardarNota(float nota) {
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]==-1) {
				notas[i] = nota;
				break;
			}
		}
	}
	
	
	
	
	//Modificar el método toString que heredamos de Object-->sobreescribir
	
	
	
	@Override
	
	public String toString() {
		return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad;
	}
	
	

}
