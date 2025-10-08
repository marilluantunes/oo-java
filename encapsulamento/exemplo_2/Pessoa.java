package encapsulamento.exemplo_2;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    //construtor

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.email = "";
    }

    //getters

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getEmail(){
        return this.email;
    }

    // SETTERS

    public void setIdade(int novaIdade){
        if (novaIdade >= 0 && novaIdade <= 150){
            this.idade = novaIdade;
        } else {
            System.out.println("idade indalida");
        }
    }

    public void setEmail(String novoEmail){
        if (novoEmail != null && novoEmail.contains("@")){
            this.email = novoEmail;
        } else {
            System.out.println("email invalido");
        }
    }
}


class TestePessoa{
    public static void main(String[] args) {
         //criando pessoa
        Pessoa pessoa = new Pessoa("Maria" , 77);

         //lendo dados

        System.out.println("nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("email: " + pessoa.getEmail());

            //alterando dados SETTERS

        pessoa.setIdade(78);
        pessoa.setEmail("maria@email.com");

            //tentativas bloqueadas

            //pessoa.setIdade(-5);
            //pessoa.setEmail("email-sem-arroba");
            //pessoa.nome = "mirian";

            

            // Depois das alteraçoes

        System.out.println("depois das alteraçoes");
        System.out.println(("nome: " + pessoa.getNome()));
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("email: " + pessoa.getEmail());
        }
    }
    

