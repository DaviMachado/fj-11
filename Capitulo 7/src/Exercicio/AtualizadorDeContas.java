package Exercicio;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	// Construtor com argumento
	public AtualizadorDeContas (double selic) {
		this.selic += selic;
	}
	// Método que imprime o saldo anterior, 
	// atualiza a conta,
	// imprime o saldo final,
	// e somando o saldo final ao atributo saldoTotal
	public void roda (conta c) {
		System.out.println("Saldo anterior: " + c.saldo);
		c.atualiza(this.selic);
		System.out.println(c.saldo);
		this.saldoTotal += c.saldo;
	}
	// Método get do saldoTotal
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
