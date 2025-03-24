package pratica;

import java.util.Scanner;

public class Imposto {

    private String nome;
    private double rendaBruta;
    private double limiteRenda = 2000.00;

    public Imposto (double rendaBruta, String nome){
        this.rendaBruta = rendaBruta;
        this.nome = nome;

    }

    public double calcularImposto(){
        double imposto = 0;
        if (rendaBruta <= limiteRenda){
            imposto = 0;
        } else if (rendaBruta > 1400 && rendaBruta <= 2100){
            imposto = (rendaBruta * 0.1) - 100;
        } else if (rendaBruta > 2100 && rendaBruta <= 2800){
            imposto = (rendaBruta * 0.15) - 270;
        } else if (rendaBruta > 2800 && rendaBruta <= 3600){
            imposto = (rendaBruta * 0.25) - 500;
        } else if (rendaBruta > 3600){
            imposto = (rendaBruta * 0.3) - 700;
        }
        return imposto;
    }

    public void exibirImposto(){
        Scanner info = new Scanner(System.in);
        double imposto = calcularImposto();
        System.out.println("O imposto devido por " + nome + " é " + imposto);

    info.close();
    }
}
