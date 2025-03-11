package pratica;

import java.util.Scanner;

public class Impar {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Digite qualquer número:");
        int numero = info.nextInt();

        String resultado = numero % 2 == 0 ? "par" : "ímpar";
        System.out.println("O número " + numero + " é " + resultado + ".");
    }
}
