package pratica;

import java.util.Scanner;

public class Mes {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        int dia;

        do {
            System.out.println("Digite o dia da semana 1 a 7:");

            dia = info.nextInt();

            switch (dia){

                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                 case 4:
                    System.out.println("Quarta-feira");
                    break;
                 case 5:
                    System.out.println("Quinta-feira");
                    break;
                 case 6:
                    System.out.println("Sexta-feira");
                    break;
                 case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (dia < 1 || dia > 7);
    }
}
