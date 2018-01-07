package Exercicio;

public class exercicio6 {
	public static void main(String[] args) {
		// Imprima os primeiros números da série de Fibonacci até passar de 100
		int anterior = 0;
		int atual = 1;
		int proximo;
		
		for (int i = 0; i <= 100; i++) {
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			System.out.println(proximo);
			if (proximo > 100) {
				break;
			} // if
		} // for
		
	} // main
}
