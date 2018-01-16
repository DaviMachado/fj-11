package Exercicio;

public class FixandoConhecimento1 {
	// 1) Programa 1
	// Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e
	// imprima seu nome e sua idade
	
	// Classe pessoa
		String nome = "Davi";
		int idade = 22;
		
		// Método para fazer aniversario
		void fazAniversario() {
			this.idade += 1;
		}
		// Método para imprimir nome e idade
		void imprimir() {
			System.out.println("Feliz Aniversario " + this.nome + ", " + this.idade + " anos");
		}
	
	public static void main(String[] args) {
		FixandoConhecimento1 f1 = new FixandoConhecimento1();
		f1.fazAniversario();
		f1.imprimir();
		f1.fazAniversario();
		f1.imprimir();
	}
}
