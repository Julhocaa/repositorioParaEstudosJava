package etapaConstrucao;

import java.util.Scanner;

public class Casa {
   //Criando Objeto
    public static void main(String[] args) {

        //inicializando os atributos
        PlantaCasa casa = new PlantaCasa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a metragem da sua etapaConstrucao.Casa?");
        casa.metragem = sc.nextInt();

        System.out.println("Quantos banheiros tem sua etapaConstrucao.Casa?:");
        casa.numeroBanheiros = sc.nextInt();

        System.out.println("Quantos quartos tem sua etapaConstrucao.Casa");
        casa.numeroQuartos = sc.nextInt();

        System.out.println("Quantos escritorios tem sua casa?");
        casa.escritorio = sc.nextInt();
        sc.nextLine();

        System.out.println("Qua(s)materia(s) você ira usar?");
        casa.material = sc.nextLine();

        System.out.println("Qual a cor da sua casa?");
        casa.cor = sc.nextLine();


        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Vermelho");

        int resultado = casa.somarMetragem();
        System.out.println("Resultado:"+resultado);


        casa.alterarCaracteristicas(100, 3, 2 ,"Marmore");
        int resultado2 = casa.somarNovaMetragem();
        System.out.println("Resultado:"+resultado2);


        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem =200;
        casaVizinho.material = "Alvernaria";
        casaVizinho.numeroBanheiros = 3;
        casaVizinho.numeroQuartos = 5;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();
        casaVizinho.mudarCorParede("Azul");

    }

}
