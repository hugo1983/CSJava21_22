package herencia1;

public class PruebaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Cliente c1 = new Cliente("11341324","Rambo",450);
		//La referencia c1 me da acceso a todo lo que está definido en la clase Cliente o heredado de Object
			//	c1.setSaldo(300);
		
		//Polimorfismo en acción: Una misma referencia puede manipular diferentes tipos de objetos:
		//c1 = new ClienteBasico("13241234","Pepito Grillo",200);
	//	c1 = new ClienteCompleto();
	//	c1 = new ClientePremium();
		/*******************************************************************/
		
		
		
		ClienteBasico cb1 = new ClienteBasico("11111111E","Manuel Rodriguez",900);
		//La referencia cb1 es capaz de acceder a todas las funciones públicas definidas en la clase ClienteBasico
		//Y a todas las funciones públicas heredadas de la clase Cliente.
		ClienteCompleto cc1 = new ClienteCompleto("90909090E","Pedro Dominguez",800,"Acceso pista Paddle");
		ClientePremium cp1 = new ClientePremium("13241431","Perico de los palotes",4000,50,10);
		
		cp1.addExtra("SPA Gratuito");
		cp1.addExtra("Aparcacoches");
		
		
		
		//Mostrar por pantalla info de los 3 clientes
		System.out.println(cb1.toString());
		System.out.println(cc1.toString());
		System.out.println(cp1.toString());
		
		//Upcast y downcast de objetos
		Cliente c = cb1;
		Cliente c2 = cp1;
		Cliente c3 = cc1;
		
		
		Cliente miCliente = new ClienteBasico();
		ClienteBasico miCliente2 = new ClienteBasico();
		
		miCliente2 = (ClienteBasico) miCliente;
		
		
		
		
		
		
		
		
		
		

	}

}
