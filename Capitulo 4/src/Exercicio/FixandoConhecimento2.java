package Exercicio;

public class FixandoConhecimento2 {
	// 2) Programa 2
	// Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
	// estaAberta para vericar se ela está aberta.
	
	// Classe Porta
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	// Método que abre a porta
	void abre() {
		this.aberta = true;
	}
	// Método que fecha a porta
	void fecha() {
		this.aberta = false;
	}
	// Método que pinta a porta
	void pinta (String s) {
		this.cor = s;
		System.out.println("Cor da porta: " + this.cor);
	}
	// Método para verificar se a porta esta aberta
	boolean estaAberta() {
		if (this.aberta) {
			System.out.println("A porta esta aberta!");
			return this.aberta;
		}
		else {
			System.out.println("A porta esta fechada!");
			return this.aberta;
		}	
	}
	
	public static void main(String[] args) {
		FixandoConhecimento2 f2 = new FixandoConhecimento2();
		f2.dimensaoX = 1.1;
		f2.dimensaoY = 2.2;
		f2.dimensaoZ = 3.3;
		f2.pinta("Verde");
		f2.abre();
		
		System.out.println("A suas dimensões são:\n" + f2.dimensaoX + "\n" + f2.dimensaoY + "\n" + f2.dimensaoZ);
		f2.estaAberta();
	}
}
