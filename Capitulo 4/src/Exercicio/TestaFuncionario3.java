package Exercicio;

public class TestaFuncionario3 {
	public static void main(String[] args) {
		// refer�ncias iguais (por que as duas variaveis est�o inst�nciando da a mesma classe)
		
		funcionario f1 = new funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		
		funcionario f2 = f1;
		
		if (f1 == f2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
	}
}
