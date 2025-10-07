package encapsulamento.codigo_fragil;

public class ContaBancaria {
    public double saldo;
    public String senha;
    
}

class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // problema: saldo pode ficar negativo
        conta.saldo = -1000;
        System.out.println("seu saldo é: " + conta.saldo);

        // senha pde ser acessada diretamente

        conta.senha = "abc-123";

        System.out.println("sua senha é: " + conta.senha);

        // qualquer pessoa pode modificar os dados 

        conta.saldo = 999999;

        System.out.println("seu novo saldo é: " + conta.saldo);
    }
}
