package Exercicio;

public class TestaFuncionario {
	public static void main(String[] args) {
		funcionario f1 = new funcionario();
		
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		f1.estaNaEmpresa = false;
		
		System.out.println("Salario atual: " + f1.salario);
		System.out.println("Ganho anual: "+ f1.calculaGanhoAnual());
		f1.demite();
		System.out.println("\nTodos os atributos da classe funcionario:");
		f1.mostra();
	}
}
