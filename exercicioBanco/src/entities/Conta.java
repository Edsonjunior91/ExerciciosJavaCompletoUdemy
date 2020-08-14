package entities;

public class Conta {
	private int numConta;
	private String nomTitConta;
	private double valorConta;
	
	public void setNumConta (int numConta) {
		this.numConta = numConta;
	}
	public void setNomTitConta(String nomTitConta) {
		this.nomTitConta = nomTitConta;
	}
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public String getNomTitConta() {
		return nomTitConta;
	}
	public double getValorConta() {
		return valorConta;
	}
	public double deposito(double deposito) {
		return valorConta+=deposito;
	}
	public double saque(double saque) {
		return valorConta=valorConta-5-saque;
	}
	
}
