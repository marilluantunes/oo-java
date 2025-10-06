package construtor_padrao;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        //Opcional
        nome = "qualquer nome";
        idade = 0;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
    
}
