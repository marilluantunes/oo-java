class Pessoa {
    String nome, cpf;
    Veiculo automovel;

    void comprarVeiculo(Veiculo v){
        automovel = v;
        System.out.println(nome + " comprou o veículo:" + v.modelo);
    }
}