package Exercicio;

public class TestaFuncionario2 {
	public static void main(String[] args) {
		// referências diferentes (por que as duas variaveis estão instânciando a mesma classe para variaveis diferentes)
		
		funcionario f1 = new funcionario();
		f1.nome = "danilo";
		f1.salario = 100;
		
		funcionario f2 = new funcionario();
		f2.nome = "danilo";
		f2.salario = 100;
		
		if (f1 == f2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
	}
}
