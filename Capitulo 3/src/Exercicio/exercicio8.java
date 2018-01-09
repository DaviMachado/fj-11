package Exercicio;

public class exercicio8 {
	public static void main(String[] args) {
		// Imprime a tabela "iNumero" usando for's encadeados
		
		int iNumero = 10;
		
		for (int i = 1; i <= iNumero; i++ ) {
			System.out.print(i + " ");				// Imprime a primeira coluna, de 1 ate iNumero
			for (int j = 1; j < i; j++) {			// A quantidade de coluna vai até ser igual a "i"
				System.out.print( i * (j+1) + " ");	// Imprime as linhas, de i vezes ate ele mesmo
			} // for j
			System.out.print("\n");					// pula de linha
		} // for i
	}
}
