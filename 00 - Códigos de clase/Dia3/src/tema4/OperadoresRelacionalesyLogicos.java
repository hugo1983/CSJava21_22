package tema4;

public class OperadoresRelacionalesyLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores matem�ticos + , - *, /, %
		//Operadores de asignacion = , +=,-=
		//Operadores relacionales: ==,<,<=,>,>=, !=
		
		int x = 11;
		int y = 9;
		boolean condicion = x==y;
		boolean condicion2 = x!=y;
		boolean condicion3 = x<=y;
		
		//Operadores l�gico : AND --> (condicion1)&&(condicion2)
		boolean condicion4 = x<=10 && x>0;
		System.out.println(condicion4);
		
		//Operador l�gico OR --> || --> (condicion1)||(condicion2)
		boolean condicion5 = x<=10 && x>0;
		System.out.println(condicion5);
		
		//Operador l�gico Not --> !(expresi�n booleana)
		boolean condicion6 = !condicion5;
		System.out.println(condicion6);
		
	}

}
