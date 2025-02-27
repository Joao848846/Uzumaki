package src;

public class Imc {

    String nome;
    double peso;
    double altura;

    public Imc(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void imctotal() {
        double imc = peso / (altura * altura);
        System.out.println("O IMC de " + nome + "do peso" + " "+ peso + " é " + imc);
    }
}