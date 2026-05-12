package Carros;

public class MoldeloCarro {
    //atributos

    private int assentos;
    private int portas;
    private int anoCarro;
    private String modeloCarro;
    private String cor;
    private String marcaAutomotiva;


    //Metodos

    public void carroMontado() {
        System.out.println("Estamos montando seu carro...");
        System.out.println("assentos: " + assentos);
        System.out.println("portas: " + portas);
        System.out.println("modelo do carro: " + modeloCarro);
        System.out.println("cor do carro: " + cor);
        System.out.println("Marca do Carros.Carro: " + marcaAutomotiva);


    }

    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

    public int getPortas() {
        return portas;

    }

    public void setPortas(int portas){
        this.portas = portas;

    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }


    public String getCor() {
        return cor;

    }

    public void setCor(String cor) {
        this.cor = cor;


    }

    public String getModeloCarro() {
        return modeloCarro;

    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;

    }
    public String getMarcaAutomotiva(){
        return marcaAutomotiva;
    }
    public void setMarcaAutomotiva(String marcaAutomotiva ){
        this.marcaAutomotiva = marcaAutomotiva;
    }

}