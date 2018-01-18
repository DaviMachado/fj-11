package Exercicio;

public class funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntradaBanco;
	String RG;
	boolean estaNaEmpresa;
	
	// M�todo para receber aumento
	void recebeAumento (double aumento) {
		double aumentoSalario = this.salario + aumento;
		this.salario = aumentoSalario;
	}
	// M�todo para verificar se o funcionario esta na empresa
	void demite() {
		if (this.estaNaEmpresa) {
			System.out.println("O empregado esta na empresa!");
		}
		else {
			System.out.println("O empregado N�O esta na empresa!");
		}
	}
	// M�todo para calcular ganho anual
	double calculaGanhoAnual() {
		return this.salario * 12;
	}
	// M�todo para mostrar todos os atributos da classe funcionario
	void mostra () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de entrada no banco: " + this.dataEntradaBanco);
		System.out.println("RG: " + this.RG);
		System.out.println("Esta na empresa: " + this.estaNaEmpresa);
	}
	// classe para guardar a data
	class Data {
		int dia;
		int mes;
		int ano;
	}
}
