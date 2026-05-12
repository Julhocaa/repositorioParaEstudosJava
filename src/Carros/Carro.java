package Carros;

import java.util.*;
public class Carro {

    public static void main(String[] args) {
        MoldeloCarro carro = new MoldeloCarro();
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos assentos seu carro tem?");
        int assentos = sc.nextInt();
        carro.setAssentos(assentos);

        System.out.println("Quantas portas teria seu carro?");
        int portas = sc.nextInt();
        carro.setPortas(portas);

        System.out.println("qual o ano do seu carro?");
        int anoCarro = sc.nextInt();
        carro.setAnoCarro(anoCarro);

        sc.nextLine();

        System.out.println("modelo do carro porfavor");
        String modeloCarro = sc.nextLine();
        carro.setModeloCarro(modeloCarro);

        System.out.println("qual a cor do seu carro amigo?");
        String cor = sc.nextLine();
        carro.setCor(cor);

        System.out.println("pra finalizar peço a marca automotiva do veiculo");
        String marcaAutomotiva = sc.nextLine();
        carro.setMarcaAutomotiva(marcaAutomotiva);

        carro.carroMontado();







    }
}