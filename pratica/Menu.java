package pratica;

import java.util.Scanner;

public class Menu {

    String nome;
    double peso;
    double altura;

    public  Menu(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        int opcao;

        Menu users1 = new Menu("João", 80, 1.75);
        Menu users2 = new Menu("Maria", 60, 1.65);
        Menu users3 = new Menu("José", 90, 1.80);

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Voltar");
            System.out.println("5 - IMC");
            System.out.println("0 - Sair");

             opcao = info.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastrando...");
            } else if (opcao == 2) {
                System.out.println("Listando...");
                System.out.println(users1.nome );
            } else if (opcao == 3) {
                System.out.println("Excluindo...");
            } else if (opcao == 4){
                System.out.println("Voltando...");
            } else if (opcao == 5){
                System.out.println("Digite seu peso:");

            }

        } while ( opcao != 0);

        System.out.println("Opção:" + " " + opcao);
        info.close();
    }
}
