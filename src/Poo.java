package src;

import java.util.Scanner;

public class Poo {

    public  static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Digite o ano atual:");

        int anoAtual = info.nextInt();

        System.out.println("Digite ano de nascimento:");

        int anoNascimento = info.nextInt();

        System.out.println("Digite o estado onde você mora: (1 - SP, 2 -RJ");
        int estado = info.nextInt();

        int infos = (anoAtual - anoNascimento);
        if (infos == 17) {
            System.out.println("Pode só pode votar na proxima eleiçã0");
        } else if (infos >= 18 && estado == 1) {
            System.out.println("Voce pode votar no estado de SP");
        } else {
            System.out.println("Não pode votar");
        }

        info.close();
    }
}
