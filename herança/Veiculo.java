package herança;

// CLASSE MAE 

public class Veiculo {
    String marca;
    String modelo;
    int anoFab;
    int anoMod;
    int numOcupantes;

    void ligar() {
        System.out.println("o veiculo easta ligado!");
    }

    void desligar(){
        System.out.println("o veiculo esta desligado!");
    }
}

    //SUBCLASSE

class Motocicleta extends Veiculo{
    int cilindradas;
    boolean bau;
    boolean abs;

    void acelerar(){
        System.out.println("acelerando a motocicleta");
        }

    void frear(){
        System.out.println("freando a motocicleta");
    }
}
    


