package construtor_padrao;

public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.mostrarInfo();

        System.out.println("--------------------------------------------");

        Pessoa p1 = new Pessoa();
        p1.nome = "Maria";
        p1.idade = 77;
        System.out.println("Nome da pessoa(p1): " + p1.nome);
        System.out.println("Idade da pessoa (p1): " + p1.idade);
    }
    
}
