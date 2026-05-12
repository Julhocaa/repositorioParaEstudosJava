package Logicaa;

import java.util.*;
public class teste2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double comissao = totalVendas * 0.15;

        double receberFinalMes = salarioFixo + comissao;

        System.out.printf("TOTAL = %.2f\n",receberFinalMes);
    }

}