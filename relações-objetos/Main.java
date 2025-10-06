
// --------------------------- TESTE DE RELACIONAMETO -------------------------------------

public class Main {
    public static void main(String[] args) { 

        // obj pessoas

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria";
        pessoa1.cpf = "123-123";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Joao";
        pessoa2.cpf = "321-321";

        // obj veiculo

        Veiculo carro1 = new Veiculo();
        carro1.modelo = "Fiat";
        carro1.placa = "ABC";
        carro1.ano = 2025;

        Veiculo carro2 = new Veiculo();
        carro2.modelo = "hyundai";
        carro2.placa = "XZVV-12";
        carro2.ano = 2020;

        // relacoes

        System.out.println("..................");
        pessoa1.comprarVeiculo(carro1);
        pessoa2.comprarVeiculo(carro2);

        // relacoes

        System.out.println("XXXXXXX MAIS INFORMAOES XXXXXXXXXXXXXXX");
        System.out.println("Carro de " +pessoa1.nome + ":");
        System.out.println("Modelo:" + pessoa1.automovel.modelo);
        System.out.println("Placa:" + pessoa1.automovel.placa);
        System.out.println("Ano:" + pessoa1.automovel.ano);

    }
}