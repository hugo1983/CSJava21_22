package sentenciasSeleccion;

public class IfElseIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Evaluar una nota como: Suspenso, Aprobado, Notable, Sobresaliente,Error si es <0 Or > 10
		float nota = 9.5f;
		String evaluacion="";
		
		
		if(nota <0 || nota >10) {
			int num = 0;
			evaluacion = "Error";
		}
		else if(nota < 5) {
			
			evaluacion = "Suspenso";
		}
		else if(nota < 6) {
			evaluacion = "Aprobado";
		}
		else if(nota <9) {
			evaluacion = "Notable";
			
		}			
		
		  else { evaluacion = "Sobresaliente"; }
		 
		 
		
		System.out.println("Tienes un : " + evaluacion);
		
	}

}
