package herencia1;

public class ClienteBasico extends Cliente {
	
	private float gastoLimite;
	
	public ClienteBasico() {
		super();
	}
	public ClienteBasico (String dni,String username,float saldo) {
		super(dni,username,saldo);
		//Establecer el gasto limite a 200€
		gastoLimite = 200;		
		
	}
	public float getGastoLimite() {
		return gastoLimite;
	}
	public void setGastoLimite(float gastoLimite) {
		this.gastoLimite = gastoLimite;
	}
	@Override
	public String toString() {
		return "ClienteBasico " + super.toString() + "[gastoLimite=" + gastoLimite + "]";
	}
	@Override
	public void aumentarSaldo() {
		// TODO Auto-generated method stub
		float saldoActual = super.getSaldo();
		setSaldo(saldoActual + saldoActual*0.2f);
	}
	
	public void imprimeGrupo() {
		
	}
	
}
