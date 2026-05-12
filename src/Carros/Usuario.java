package Carros;

import java.util.*;

public class Usuario {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        //sistema de cadastro
        System.out.println("Digite seu usuario");
        String usuario = sc.nextLine();

        System.out.println("Digite seu senha");
        String senha = sc.nextLine();

        System.out.println("Digite seu CPF");
        String cpf = sc.nextLine();

        System.out.println("Digite seu numero de telefone");
        String telefone = sc.nextLine();

        System.out.println("Digite sua orientação sexual");
        String genero = sc.nextLine();

        System.out.println("Digite sua data de nascimento");
        String dataNascimento = sc.nextLine();

        ModeloUsuario user = new ModeloUsuario(usuario, senha, cpf, telefone, genero, dataNascimento);

        System.out.println("Cadastros realizados");

    }

    //Login



}
