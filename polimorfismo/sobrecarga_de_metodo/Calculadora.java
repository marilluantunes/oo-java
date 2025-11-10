package polimorfismo.sobrecarga_de_metodo;

//EXEMPLO 1

public class Calculadora {

    // METODO 1 - soma de dois numeros inteiros

    public int somar(int a , int b){
        return a + b;
    }

    // METODO 2 - soma de tres numeros inteiros

    public int somar(int a, int b, int c){
        return a + b + c;
    }

    // METODO 3 - soma de dois numeos decimais (double)

    public double somar(double a, double b){
        return a + b;
    }

    
}

class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2,3)); // chama o metodo com (int, int)
        System.out.println(calc.somar(2,3,4)); // chama o metodo com (int.int.int)
        System.out.println(calc.somar(2.5,3.7)); // chama o metodo com (double,double)
    }
}
