package pratica;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args){

        Scanner info = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        int senha = info.nextInt();
        int valor = 1234;

        while(senha != valor || !info.hasNextInt()){
            System.out.println("Senha inválida, tente novamente:");
            senha = info.nextInt();
        }

        System.out.println("Senha correta!");


        info.close();
    }
}
