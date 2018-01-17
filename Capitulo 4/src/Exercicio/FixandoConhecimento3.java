package Exercicio;

public class FixandoConhecimento3 {
	// 3) Programa 3
	// Crie uma casa e pinte-a. Crie tr�s portas e coloque-as na casa; abra e feche as mesmas como desejar.
	// Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas abertas.
	
	// Classe casa
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;
	
	// M�todo para pintar a casa
	void pinta (String s) {
		this.cor = s;
		System.out.println("A cor da casa �: " + this.cor);
	}
	// M�todo para verificar qunatas portas est�o abertas
	int quantasPortasEstaoAbertas () {
		int QtdeAbertas = 0;
		if (this.porta1)
			QtdeAbertas += 1;
		if (this.porta2)
			QtdeAbertas += 1;
		if (this.porta3)
			QtdeAbertas += 1;
		
		return QtdeAbertas;
	}
	
	public static void main(String[] args) {
		FixandoConhecimento3 f3 = new FixandoConhecimento3();
		f3.pinta("Vermelho");
		f3.porta1 = false;
		f3.porta2 = true;
		f3.porta3 = true;
		System.out.println("Tem " + f3.quantasPortasEstaoAbertas() + " porta(s) aberta(s)!");
	}
}
