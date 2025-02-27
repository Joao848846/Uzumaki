package src;

import java.util.Scanner;

public class Vo2 {

    public static void main(String[] args) {

        // D = Distância
        // T = Tempo => 60 minutos
        // V = Velocidade

        String corredor;
        int D;
        double T;

        Scanner info = new Scanner(System.in);

        System.out.println("Qual o nome do corredor?");
        corredor = info.nextLine();

        System.out.println("Qual a distância percorrida(Em Metros)?");
        D = info.nextInt();

        System.out.println("Qual o tempo gasto(Em Minutos)?");
        T = info.nextDouble();

       double pace = T / (D / 1000.0);
       double velocidade = (D / (T * 60.0)) * 3.6;
       double v02 = velocidade * 3.5;

        System.out.printf("O pace do %s foi de %.2f min/km%n", corredor, pace);
        System.out.printf("O VO2 do %s foi de %.2f ml/kg/min%n", corredor, v02);

        if (v02 < 35) {
            System.out.println("O VO2Max " + " está baixo");
        } else if (v02 >= 35 && v02 <= 45) {
            System.out.println("O VO2Max " + " é moderado");
        } else if (v02 >= 46 && v02 <= 55)  {
            System.out.println("O VO2Max do " +  " é bom");
        } else {
            System.out.println("O VO2 do " + " é excelente");
        }

        info.close();
    }
}
