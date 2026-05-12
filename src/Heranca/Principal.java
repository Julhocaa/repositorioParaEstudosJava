package Heranca;

public class Principal{
    public static void main(){

        Cachorro caramelo = new Cachorro();


        caramelo.latir();
        caramelo.comer("racao");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudes  = new Galinha();
        gertrudes.ciscar();
        gertrudes.comer("Milho");
        gertrudes.beberAgua();
        gertrudes.dormir();

    }
}
