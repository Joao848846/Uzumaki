package src;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
         double nota1 = notas.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = notas.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = notas.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        if ( media >= 7) {
            System.out.println("Aprovado" + "Sua media foi de: " + media);
        } else if (media >=5)  {
            System.out.println("Recuperação" + "Sua media foi de: " + media);
        } else {
            System.out.println("Reprovado" + "Sua media foi de: " + media);

        }

        notas.close();
    }
}
