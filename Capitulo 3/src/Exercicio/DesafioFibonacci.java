package Exercicio;

public class DesafioFibonacci {
	public static void main(String[] args) {
		// Fa�a o exerc�cio da s�rie de Fibonacci usando apenas duas vari�veis
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < 19; i++) {
			System.out.print((a) + " ");
			a = a + b;
			b = a - b;
		} // for i
		
		// OU dessa forma.... (visto na internet "GUJ")
		/* 
		int a = 1;   
        for (int i = 0; i <= 100;) {  
            System.out.print(i + " ");  
            i = i + a;  // i incrementado
            a = i - a;   
        } 
        */
	} // main
}
