package pruebas;

import misClases.AlumnoPlus;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlumnoPlus a1 = new AlumnoPlus("1231432W", "Maria Sanchez", 56, 5);
		a1.guardarNota(10);
	    a1.guardarNota(5);
		AlumnoPlus a2 = new AlumnoPlus();
		a2.guardarNota(9);
		a2.guardarNota(10);
		System.out.println(AlumnoPlus.getCentroEducativo());
		System.out.println(a2.getCentroEducativo());
		
		AlumnoPlus a3 = AlumnoPlus.getAlumnoConMediaAlta(a1, a2);
		System.out.println(AlumnoPlus.getAlumnoConMediaAlta(a1, a2).toString());
		
		System.out.println("Número de alumnos creados: " + AlumnoPlus.contador);
		
	}

}
