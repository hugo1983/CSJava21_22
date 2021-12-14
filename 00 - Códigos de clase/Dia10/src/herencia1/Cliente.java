package herencia1;

public abstract class Cliente  {
	
	private String dni;
	private String username;
	private float saldo;
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String dni, String username, float saldo) {
		super(); //Llamada al constructor de la clase base Object
		this.dni = dni;
		this.username = username;
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "[dni=" + dni + ", username=" + username + ", saldo=" + saldo + "]";
	}
	
	public abstract void aumentarSaldo();	
	
	public static void addCliente(Cliente[] clientes,Cliente c1 ) {
		for(int i = 0;i<clientes.length;i++) {
			if(clientes[i]!=null) {
				clientes[i] = c1;
				break;
			}
		}
	}
}
