package Exercicio;

public class conta {
	protected double saldo;
	
	// Método get do saldo
	public double getSaldo() {
		return this.saldo;
	}
	// Método para depositar 
	public void deposita (double valor) {
		this.saldo += valor;
	}
	// Método para sacar
	public void saca (double valor) {
		this.saldo -= valor;
	}
	// Método que atualiza a conta de acordo com uma taxa percentual fornecida
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
