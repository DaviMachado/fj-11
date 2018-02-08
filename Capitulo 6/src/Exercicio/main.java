package Exercicio;

public class main {
	public static void main(String[] args) {
		exercicio1 teste = new exercicio1();
		teste.setNome("davi");
		System.out.println(teste.getNome());
		
		teste.setSalario(100);
		System.out.println(teste.getSalario());
		
		// testando o construtor com argumento
		exercicio1 teste2 = new exercicio1("ola");
		System.out.println(teste2.getNome());
		
		// testando contrutor sem argumento e atributo da classe
		exercicio1 teste3 = new exercicio1();
		System.out.println(teste3.getIdentificar());
	}
}
