package herencia1;

public class GestorClientes {

	private Cliente[] clientes;
	
	
	public GestorClientes() {
		clientes = new Cliente[10];
	}
	
	public GestorClientes(int tamanho) {
		clientes = new Cliente[tamanho];
	}
	
	public GestorClientes(Cliente[] c) {
		clientes = c;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public void addCliente(Cliente c) {
		for(int i = 0;i<this.clientes.length;i++) {
			if(this.clientes[i]==null) {
				this.clientes[i] = c;
				break;
			}
		}
	}
	
	public Cliente getClienteByDNI(String dni) {
		
		for(Cliente c : this.clientes) {
			if(c.getDni().equals(dni)) {
				return c;
			}
		}
		return null;
	}
	
	public void aumentarSaldoC() {
		for(Cliente c: this.clientes) {
			if(c!=null) {
				c.aumentarSaldo();
			}
		}
	}
}
