package Exercicio;

public class TestaContas {
	public static void main(String[] args) {
		conta c = new conta();
		ContaCorrente  cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas abc = new AtualizadorDeContas(0.01);
		
		abc.roda(c);
		abc.roda(cc);
		abc.roda(cp);
		
		System.out.println("Saldo Total: " + abc.getSaldoTotal());
	}
}
