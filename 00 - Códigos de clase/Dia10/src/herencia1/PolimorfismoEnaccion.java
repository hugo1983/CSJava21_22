package herencia1;

public class PolimorfismoEnaccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente[] misClientes = new Cliente[20];
		
		misClientes[0] = new ClienteBasico("12312334R","El bolechas",350);
		misClientes[1] = new ClientePremium("123445323","Abel Sanchez",900,80,10);
		misClientes[2] = new ClienteCompleto("90909090E","Pedro Dominguez",800,"Acceso pista Paddle");
		misClientes[3] = new ClienteOnlineVodafone("13234121","Ibai Llanos",450,"erewqrqewr");
		
		for(int i = 0;i<misClientes.length;i++) {
			if(misClientes[i]!=null) {
				misClientes[i] = new ClienteBasico("2134","ASDFADSF",500);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		Cliente.addCliente(misClientes, new ClienteOnlineVodafone("1341234","Miguel",670,"qwer"));
		
		
		GestorClientes g1 = new GestorClientes(100);
		GestorClientes g2 = new GestorClientes(misClientes);
		
		g1.addCliente(new ClienteBasico("08798732","Pablo Gutierrez",800));
		g1.addCliente(new ClienteCompleto("134123421","Lucía Sanchez",900,"Acceso Pistaesquí"));
		g1.addCliente( new ClientePremium("123445323","Abel Sanchez",900,80,10));
		g1.addCliente( new ClientePremium("9023423","Maria Gulías",900,80,10));
		g1.addCliente(new ClienteCompleto("90941234","Sonia Marinez",900,"Acceso Pistaesquí"));
		g1.addCliente(new ClienteBasico("827434","Raquel Dario",800));
		
		//Aumentar el gasto limite de los clientes basicos a 350
		
		for(Cliente c : g1.getClientes()) {
			//Desde una referencia de tipo Cliente no tengo acceso a datos definidos en clases hijas
			//Debo hacer un cast de la variable c para pasarla una varia ble de tipo ClienteBasico
			if(c instanceof ClienteBasico) {
				ClienteBasico cb = (ClienteBasico) c;
				cb.setGastoLimite(350);
			}
			
		}
		for(Cliente c : g1.getClientes()) {
			if(c!=null) {
				System.out.println(c);
			}
		}
		g1.aumentarSaldoC();
		
		//Mostrar por pantalla toda la información
		System.out.println();
		System.out.println("Después de aumentar el saldo.");
		for(Cliente c : g1.getClientes()) {
			if(c!=null) {
				System.out.println(c);
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
