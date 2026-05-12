package Logicaa;

import java.util.*;
public class Teste3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        int peca1 = sc.nextInt();
        int numeroDePeca = sc.nextInt();
        double valorUnitarioPecas = sc.nextDouble();


        //2
        int peca2 = sc.nextInt();
        int numeroDePeca2 = sc.nextInt();
        double valorUnitarioPecas2 = sc.nextDouble();

        double TOTAL = (valorUnitarioPecas*numeroDePeca) + (valorUnitarioPecas2*numeroDePeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);

    }

}