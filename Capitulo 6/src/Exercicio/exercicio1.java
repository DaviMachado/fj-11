package Exercicio;

public class exercicio1 {
	// Classe funcionario
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntradaBanco;
	private String RG;
	private boolean estaNaEmpresa;
	private static int identificador;
	
	// Método para calcular ganho anual
	private double calculaGanhoAnual() {
		return this.salario * 12;
	}
	//
	// get & set
	//
	// Nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	// Salario
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// identificador
	public int getIdentificar() {
		return exercicio1.identificador;
	}
	
	// Construtor sem argumento
	public exercicio1() {
		exercicio1.identificador = exercicio1.identificador + 1;
	}
	// Construtor com argumento
	public exercicio1(String nome) {
		this.nome = nome;
	}
}
