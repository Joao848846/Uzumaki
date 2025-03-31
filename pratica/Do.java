package pratica;

import java.util.Scanner;

public class Do {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        int number;

        do {

            System.out.println("Digite um número: ");
            number = info.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("O numero está valido:" + number);
        info.close();
    }
}
