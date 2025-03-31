package pratica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à caixa de impostos!");
        System.out.print("Digite o nome do contribuinte: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a renda bruta: ");
        double rendaBruta = scanner.nextDouble();

        Imposto imposto = new Imposto(rendaBruta, nome);
        imposto.exibirImposto();

        scanner.close();
    }
}
