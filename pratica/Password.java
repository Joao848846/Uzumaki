package pratica;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        final int SENHA_CORRETA = 1234;
        int senha;

        System.out.println("Digite a sua senha:");

        // Verifica se a entrada é um número
        while (!info.hasNextInt()) {
            System.out.println("Entrada inválida! Digite apenas números:");
            info.next(); // Descarta a entrada inválida
        }
        senha = info.nextInt();

        // Enquanto a senha estiver errada, pede novamente
        while (senha != SENHA_CORRETA) {
            System.out.println("Senha inválida, tente novamente:");

            // Verifica se a entrada é um número novamente
            while (!info.hasNextInt()) {
                System.out.println("Entrada inválida! Digite apenas números:");
                info.next();
            }
            senha = info.nextInt();
        }

        System.out.println("Senha correta! ✅");
        info
                .close();
    }
}
