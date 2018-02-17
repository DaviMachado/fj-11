package Exercicio;

public class conta {
	protected double saldo;
	
	// M�todo get do saldo
	public double getSaldo() {
		return this.saldo;
	}
	// M�todo para depositar 
	public void deposita (double valor) {
		this.saldo += valor;
	}
	// M�todo para sacar
	public void saca (double valor) {
		this.saldo -= valor;
	}
	// M�todo que atualiza a conta de acordo com uma taxa percentual fornecida
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
