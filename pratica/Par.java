package pratica;

import java.util.Scanner;

public class Par {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = info.nextInt();

        if (numero % 2 == 0) { // usa o % para dividir o número por 2 e verificar se o resto é 0
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        info.close();
    }
}
