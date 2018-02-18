package Exercicio;

public class ContaCorrente extends conta implements Tributavel {
	
	// @Override
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
