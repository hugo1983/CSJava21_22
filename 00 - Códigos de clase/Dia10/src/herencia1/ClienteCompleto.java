package herencia1;

public class ClienteCompleto extends Cliente {
	
	private String extra;

	public ClienteCompleto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteCompleto(String dni, String username, float saldo,String extra) {
		super(dni, username, saldo);
		// TODO Auto-generated constructor stub
		this.extra = extra;
		
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "ClienteCompleto "+ super.toString() + "[extra=" + extra + "]";
	}

	@Override
	public void aumentarSaldo() {
		// TODO Auto-generated method stub
		float saldoActual = super.getSaldo();
		setSaldo(saldoActual + saldoActual*0.3f);
	}

	
	
	

}
