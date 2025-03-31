package src;

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner mercado = new Scanner(System.in);
        System.out.println("Qual a quantidade: ");
        int quantidade = mercado.nextInt();
        double preco;
        if (quantidade <= 10) { // valida se é menor ou igual a 10
            preco = 1.00;
        } else {
            preco = 0.25;
        }
        double total = quantidade * preco;
        System.out.println("O total da compra é: " + total);

        mercado.close();

    }
}
