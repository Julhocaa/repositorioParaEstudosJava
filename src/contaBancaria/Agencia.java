package contaBancaria;

public class Agencia {
    public static void main(String[] args){
        ContaBancaria minhaConta = new ContaBancaria("Julio", 200.00);

        System.out.println("o titular da conta é: "+minhaConta.getTitular()+" e o saldo final é: "+minhaConta.getSaldo());

        minhaConta.setTitular("Julio Nascimento");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String  titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: "+titularConta+" é o saldo final é: "+saldoFinal);

        ContaBancaria minhaMae = new ContaBancaria("Carla");
        System.out.println(minhaMae.getTitular( )+ " e o saldo: " + minhaMae.getSaldo( ));



    }
}
