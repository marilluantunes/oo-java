// EXEMPLO 1 


package polimorfismo.sobrescrita_de_metodo;

class Veiculo {
    public double calcularImposto(){
        return 1000.0; // imposto padrao
    }

        
    }
class Motocicleta extends Veiculo {
    @Override
    public double calcularImposto(){
        return 5000.0; //motos pagam menos imposto
    }
}    

class Caminhao extends Veiculo {
    @Override
    public double calcularImposto(){
        return 2000.0; // caminhos pagam mais imposto
    }
}

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Motocicleta();
        Veiculo v3 = new Caminhao();

        System.out.println("imposto veiculo: " + v1.calcularImposto());
        System.out.println("imposto moto: " + v2.calcularImposto());
        System.err.println("imposto caminhao: " + v3.calcularImposto());
    }

}


