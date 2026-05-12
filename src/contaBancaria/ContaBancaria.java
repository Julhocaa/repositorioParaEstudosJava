package contaBancaria;

public class ContaBancaria {

    //Atributos privados
    private String titular;
    private double saldo;

    //Get Set - Métodos padrões para acessar e modificar os atributos: getter & setter.

    //Metodo para obter o titular
    public String getTitular(){
        return titular;
    }

    //Metodo para modificar o titular
    public void setTitular(String titular){

        //This é uma palavra chave muito utilizada em java para se referir aos atributos, nesse caso ele faz refencia ao Atributo titular
        this.titular =titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //construtor - com Atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //construtor - sem atributos
    public ContaBancaria() {
    }

    //construtor com 1 parametro
    public ContaBancaria(double saldo){
        this.saldo = saldo;

    }

    // Construtor que inicializa a conta bancara com saldo 0
    public ContaBancaria(String titular){

        this.titular = titular;
        this.saldo = 0;
    }

}

