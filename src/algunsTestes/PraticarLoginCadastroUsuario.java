package algunsTestes;

import java.util.Scanner;

public class PraticarLoginCadastroUsuario {

    public static void main(String[] args){
    Scanner digitar = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema teste, insira suas informações porfavor");

        System.out.println("usuario");
        String usuario = digitar.nextLine();

        System.out.println("senha");
        String senha = digitar.nextLine();

        System.out.println("email");
        String email = digitar.nextLine();

        System.out.println("genero");
        String genero = digitar.nextLine();

        System.out.println("CPF");
        String cpf = digitar.nextLine();


    PraticaMoldeLoginCadastroUsuario cadastroLogin = new PraticaMoldeLoginCadastroUsuario(usuario,  senha,  email, genero, cpf);

        System.out.println("Digite seu usuario");
        String usuarioLogin = digitar.nextLine();

        System.out.println("Digite sua senha");
        String senhaLogin = digitar.nextLine();


    if(cadastroLogin.logarUsuario(usuarioLogin, senhaLogin)) {

        System.out.println("Login efetuado");

       return;

    }else{
        System.out.println("Não foi encontrado em nossa base dados suas credencias, porfavor entrar em contato com o suporte!");

        return;
    }


   }

}
