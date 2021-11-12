package pruebas;

import misClases.AlumnoPlus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*************** PRUEBAS CLASE ALUMNO PLUS *********************//
		
		AlumnoPlus a1;
		AlumnoPlus a2;
		AlumnoPlus a3 = new AlumnoPlus();
		try {
			a1 = new AlumnoPlus("12345678Y");
			a2 = new AlumnoPlus("22222222T");
			//Métodos heredados de la clase Object
			System.out.println("Hashcode a1 : " + a1.hashCode());
			System.out.println("toString a1 : " + a1.toString());
			System.out.println("Equals: " + a1.equals(a2));
			
			//Método guardar nota
			if(a1.guardarNota(1)) {
				System.out.println("Nota guardada correctamente");
			}	
			else {
				System.out.println("No se ha podido guardar la nota.");
			}
			a1.guardarNota(8);
			a1.guardarNota(7);
			
			a2.guardarNota(5);
			
			//Mostrar letra del dni de los alumnos:
			System.out.println("DNI a3: " + a2.getDni().charAt(8));
			System.out.println("DNI a1: " + a1.getDni().charAt(8));
			
			//Mostrar datos de un alumno
			System.out.println(a1.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		
					
		
	}

}
