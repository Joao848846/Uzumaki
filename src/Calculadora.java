package src;

public class Calculadora {

   private  String titular;
    public int anoAtual;
    public int anoNascimento;

    // Construtor corrigido
    public Calculadora(int anoAtual, int anoNascimento, String titular) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
        this.titular = titular;
    }

    // Método para calcular e exibir a idade
    public void calcularIdade() {
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade do" + titular + "é" + idade);
    }
}