package src;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = info.nextInt();

        for (int i = 0; i <= numero; i = i + 2) {
            System.out.println(i);
        }

        info.close();
    }
}