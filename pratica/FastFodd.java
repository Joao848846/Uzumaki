package pratica;

import java.util.Scanner;

public class FastFodd {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao FastFodd");
        Scanner info = new Scanner(System.in);

        int opcao;
        double preco;
        double total = 0;

        do {
            System.out.println("Digite o número do lanche que deseja:");
            System.out.println("1 - X-Bacon" + " " + "R$ 5,00");
            System.out.println("2 - X-Salada" + " " + "R$ 4,50");
            System.out.println("3 - X-Tudo" + " " + "R$ 7,00");
            System.out.println("4 - X-Egg" + " " + "R$ 5,50");
            System.out.println("5 - X-Burguer" + " " + "R$ 4,00");
            System.out.println("0 - Fianalizando pedido");

            opcao = info.nextInt();

            switch (opcao){
                case 1:
                    preco = 5.00;
                    System.out.println("X-Bacon" + " " + "R$ 5,00");
                    total += preco;
                    break;
                case 2:
                    preco = 4.50;
                    System.out.println("X-Salada" + " " + "R$ 4,50");
                    total += preco;
                    break;
                case 3:
                    preco = 7.00;
                    System.out.println("X-Tudo" + " " + "R$ 7,00");
                    total += preco;
                    break;
                case 4:
                    preco = 5.50;
                    System.out.println("X-Egg" + " " + "R$ 5,50");
                    total += preco;
                    break;
                case 5:
                    preco = 4.00;
                    System.out.println("X-Burguer" + " " + "R$ 4,00");
                    total += preco;
                    break;
                case 0:
                    System.out.println("finalizando pedido...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        System.out.printf("Total do pedido: R$ %.2f\n", total);
    }
}
