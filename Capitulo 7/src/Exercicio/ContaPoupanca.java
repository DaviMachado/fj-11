package Exercicio;

public class ContaPoupanca extends conta {
	
	// @ Override
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	// @Override
	public void deposita (double valor) {
		this.saldo += valor - 0.10;
	}
}
