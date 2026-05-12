package Logicaa;

public class OperadoresAritmeticos {
   public static void main(String[] args) {

       //usando operadores para compras

       double manteiga = 5.6;
       double arroz = 7.8;
       double feijão = 6.9;
       double tomate = 3.3;
       double desconto = 5;
       double diasDoMes = 30;

       double somaDosProdutos = manteiga + arroz + feijão + tomate;
       double valorDeDesconto = somaDosProdutos + desconto;
       double valorDividio = valorDeDesconto / 2;
       double valorMensal = valorDeDesconto * diasDoMes;

       System.out.printf("valor total:"+ somaDosProdutos);
       System.out.printf("\nvalor com desconto aplicado:" + valorDeDesconto);
       System.out.printf("\nvalorDividido:"+ valorDividio);
       System.out.printf("\nvalorMensal:"+valorMensal);
    }

}
