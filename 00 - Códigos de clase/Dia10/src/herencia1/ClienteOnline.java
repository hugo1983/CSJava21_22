package herencia1;

public abstract class ClienteOnline extends Cliente {

	private String password;
	
	

	public ClienteOnline(String dni, String username, float saldo, String password) {
		super(dni, username, saldo);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
