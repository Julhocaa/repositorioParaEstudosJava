package Logicaa;

public class ListaseArrays {
    public static void main(String[] args) {

        //exemplo declarando agora isso são arrays(coleções)
        int[] numeros = {3,4,5,6,7,8,9,1010};
        System.out.println(numeros[3]);


        //exemplo de definição de espaços também são arrays(coleções)
        String[] nomes = new String[5];

       nomes[0] ="Juliana";
       nomes[1] = "Marcos";
       nomes[2] = "Erick Barome";
       nomes[3] = "Suzy";
       nomes[4] = "Flavia";

        System.out.println(nomes[4]);

        //podemos também fazer assim(pra deixar mais organizado que o exemplo acima quando usamo a palavra chave de criação de objeto "new")
        String[] nomess;
        nomess = new String[3];

        nomess[0] = "Fabricio";
        nomess[1] = "Eliana";
        nomess[2] = "Gabriel";


        for(int posicao = 0; posicao<nomess.length; posicao++){

            System.out.println(posicao);

        }

        System.out.println(nomess[1]);

        for(int numero : numeros) {
            System.out.println(numero);

            nomess[0] ="julio";


            for(String nome:nomess){
                System.out.println(nome);

            }
        }



//        List<String> usuariosBanco = new List<>();
//
//       usuariosBanco.add("Julio");

    }


}
