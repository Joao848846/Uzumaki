package pratica;

import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Dgite uma letra:");
        String letra = info.nextLine();

        int i = 0;

        for (int j = 0; j < letra.length(); j++) {
             char letraAtual = letra.charAt(j);
             boolean isLetra = Character.isLetter(letraAtual);

             if (isLetra) {

                 i++;
             }
        }

        System.out.println("A quantidade de letras digitadas foi: " + i);

        info.close();
    }
}
