package etapaConstrucao;

public class PlantaCasa implements Construcao {
//Atributos
 public int metragem;
 public int numeroQuartos;
 public int numeroBanheiros;
 public int escritorio;
 public String material;
 public String cor;


    // apartir da linha 15 em diante é tudo metodo
    @Override
    public void construir(){

        System.out.println("A casa foi construida, as caracteristicas são:");
        System.out.println("Metragem:"+ metragem);
        System.out.println("Numero de quartos:"+ numeroQuartos);
        System.out.println("Numero de Banheiros:"+numeroBanheiros);
        System.out.println("Material:"+material);
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintar a casa com a cor "+ cor);
    }

    @Override
    public int calcularCustoConstrucao(int custorPorMetro) {
        return metragem + custorPorMetro;
    }

    public void pintar(){

        System.out.println("A casa foi pintada de: "+ cor);
    }

    //metodo de alteração a cor da casa
    public void mudarCorParede(String novaCor){
        cor=novaCor;

        //chamada de função
        pintar();

    }

    //metodo usado para soma de materiais
    public int somarMetragem(){
        return metragem + numeroBanheiros + numeroQuartos;


    }

    // metod de Aleteração das caracteristicas de um objeto
    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){

        metragem= metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;

        //chamada de função(metodo)
        construir();

    }

    //metodo de soma da nova metragem
    public int somarNovaMetragem(){
        return metragem + numeroBanheiros + numeroQuartos;


    }
}


