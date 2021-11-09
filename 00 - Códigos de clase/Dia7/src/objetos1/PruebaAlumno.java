package objetos1;

public class PruebaAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar 3 alumnos
						
		Alumno a1,a2,a3; //Valor null por defecto
		Alumno a4 = new Alumno();
		//Crear 3 alumnos --> Asignar a cada referencia anterior un objeto alumno
		//Operardor new.:
		a1 = new Alumno();
		a2 = new Alumno();
		a1.dni = "12345678R";
		a1.edad = 9;
		a1.nombre = "Perico Pérez";
		
		//Poner una nota al alumno a1:
		
		float nota = 5.6f;
		a1.guardarNota(nota);
		a2.guardarNota(3);
		a1.guardarNota(4);	
		
		a2.dni = "12345678R";
		a2.edad= 9;
		a2.nombre = "Perico Pérez";
		
		
		a3 = new Alumno();
		
		System.out.println("Alumno a1 : " + a1.dni + "  " + a1.nombre + " "+ a1.media);
		
		
		
		//Todas las variables en Java heredan un comportamiento por defecto de la clase Object
		//Método toString
		System.out.println("Alumno a3 : " + a3.toString());
		System.out.println("Alumno a2 : " + a2.toString());
		System.out.println("Alumno a1 : " + a1.toString());
		System.out.println("Alumno a4 : " + a4.toString());
		System.out.println("Notas de alumno a1: " + a1.notas[0]);
		
		//Método hashcode
		System.out.println("Hashcode de a1: " + a1.hashCode());
		System.out.println("Hashcode de a2: " + a2.hashCode());
		System.out.println("a1 y a2 son iguales?: " + a1.equals(a2));
		//Método equals
		a1 = a2;
		boolean iguales = a1.equals(a2);
		System.out.println("Hashcode de a1: " + a1.hashCode());
		System.out.println("Hashcode de a2: " + a2.hashCode());
		System.out.println("a1 y a2 son iguales?: " + iguales);
		
		
		
		
		
		
	}

}
