package herança;

public class Main {

    public static void main(String[] args){
        Motocicleta m1 = new Motocicleta();
        m1.marca = "Yamanha";
        m1.modelo = "MT-09";
        m1.anoFab = 2022;
        m1.numOcupantes = 2;

        //metodos herdados da classe Veiculo

        m1.ligar();
        m1.desligar();

        //metodos proprios da classe motocicleta

        m1.acelerar();
        m1.frear();
    }
    
}
