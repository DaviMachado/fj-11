package Exercicio;

public class exercicio3 {
	public static void main(String[] args) {
		// Imprima todos os m�ltiplos de 3, entre 1 e 100
		int aux = 3;
		for (int i = 1; i <= 100; i++) {
			if (i % aux == 0) {
				System.out.println(i + " � multiplo de 3");
			}
		}
	}
}
