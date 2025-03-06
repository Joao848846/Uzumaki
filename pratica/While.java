package pratica;

import java.util.Scanner;

public class While {

   public static void main(String[] args) {
       Scanner info = new Scanner(System.in);

       System.out.println("Digite um número: ");

       int numero = info.nextInt();
       int valor = 1;

       while (valor <= numero) {
           System.out.println(valor);
           valor = valor + 1;
       }

       info.close();
   }
}