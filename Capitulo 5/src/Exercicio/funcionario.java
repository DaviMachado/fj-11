package Exercicio;
	// Código pego na internet para auxuliar no problema
	// Não sei qual é o erro
public class funcionario {
	String nome;
    String departamento;
    double salario;
    String dataEntradaBanco;
    String rG;
    boolean efetivo;
    void bonifica(double aumento) {
        this.salario += aumento;
    }
    void demite() {
        this.efetivo = false;
    }
    
    class Empresa {
        String cnpj;
        funcionario[] empregados;
        void adiciona(funcionario f) {
            int flag = 0;
            for (int i = 0; flag == 0; i++) {
                if (this.empregados[i] == null) {
                    this.empregados[i] = f;
                    flag = 1;
                }
            }
        }
        void mostraEmpregados() {
            for (int i = 0; this.empregados[i] != null; i++) {
                if (this.empregados[i] != null) {
                    System.out.println("O empregado na posicação " + i);
                    System.out.println("Salario do empregado: " + empregados[i].salario);
                }
            }
        }
    }
    
    class TestaEmpresa {
        public static void main (String[] args) {
            Empresa empresa = new Empresa();
            empresa.empregados = new funcionario[10];
            funcionario f1 = new funcionario();
            f1.salario = 500.0;
            empresa.adiciona(f1);
            funcionario f2 = new funcionario();
            f2.salario = 600.5;
            empresa.adiciona(f2);
            empresa.mostraEmpregados();
        }
}
}