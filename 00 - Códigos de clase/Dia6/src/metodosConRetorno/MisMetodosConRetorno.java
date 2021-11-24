package metodosConRetorno;

public class MisMetodosConRetorno {
	
	//Zona declaraci�n m�todo
		//Sintaxis declaraci�n m�todos--> [modificador de acceso][static] tipo_Retorno Nombre(Argumentos)
		//M�todo que suma los divisores de un n�mero:
		
		 public static int sumaDivisores(int numero) {
			
			
			int suma = 0;
			
			int i = 1;
			
			while(i<=numero) {
				if(numero%i==0) {
					suma+=i;
				}
				i++;
			}
			
			return suma;		
			
		}
		
		//M�todo que me indica si un n�mero primo
		 
		  static boolean esPrimo(int x) {
			 
			 boolean primo = true;		 
			 
			 for(int i = 2;i<=x/2;i++) {
				 if(x%i==0) {
					 primo = false;
					 break;
				 }
			 }
			 return primo;
		 }

		public static int suma10(int x) {
			x = x + 10;
			return x;
		}
		
		//Sobrecarga del m�todo suma10
		public static double suma10(double x) {
			return x + 10;
		}
		
		
		public static int suma(int x, int y) {
			return x + y;
		}
		
		public static int suma(int x,int y,int z) {
			return x + y + z;
		}
		
		public static int suma(int x,int y,int z,int w) {
			return x + y + z + w;
		}
		
		
		
		
		
}
