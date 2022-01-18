package herencia1;

import java.util.Arrays;

public class ClientePremium extends Cliente {
	
	private int bono;
	private String extra[];
	
	public ClientePremium() {
		
	}
	
	public ClientePremium(String dni, String username, float saldo, int bono, String[] extra) {
		super(dni, username, saldo);
		this.bono = bono;
		this.extra = extra;
	}
	
	public ClientePremium(String dni, String username, float saldo, int bono, int tamanho) {
		super(dni, username, saldo);
		this.bono = bono;
		this.extra = extra;
		this.extra = new String[tamanho];
	}

	public int getBono() {
		return bono;
	}

	public void setBono(int bono) {
		this.bono = bono;
	}

	public String[] getExtra() {
		return extra;
	}

	public void setExtra(String[] extra) {
		this.extra = extra;
	}
	
	public void addExtra(String extra) {
		//Añadirlo a la primera pos vacía
		for(int i = 0;i<extra.length();i++) {
			if(this.extra[i]==null) {
				this.extra[i] = extra;
				break;
			}
		}
	}
	
	

	@Override
	public String toString() {
		String mensaje = "ClientePremiun " + super.toString() + " Extras contratados \n";
		
		for(String i : extra) {
			if(i!=null) {
				mensaje+=i + "\n";
			}
		}
		return mensaje;
	}

	@Override
	public void aumentarSaldo() {
		// TODO Auto-generated method stub
		float saldoActual = super.getSaldo();
		setSaldo(saldoActual + saldoActual*0.5f);
	}
	
}
