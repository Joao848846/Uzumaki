package src;

import java.util.Scanner;

public class Peso {

    public static void main (String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println ("Digite a sua altura em metros: ");
        double altura = info.nextDouble();

        System.out.println("Digite o seu sexo(1 para feminino e 2 para masculino): ");
        int sexo = info.nextInt();

        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = (62.1 * altura) - 58;
        } else {
            System.out.println("Sexo inválido");
            return;
        }
        System.out.println("O peso ideal é: " + pesoIdeal);

        info.close();
    }
}
