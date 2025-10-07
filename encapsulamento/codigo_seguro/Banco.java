package encapsulamento.codigo_seguro;


public class Banco {

    public static void main(String[] args) {
        //criando uma conta
        ContaBancaria conta = new ContaBancaria("Maria" , "1234");

        // conta.titular = "maria"; ................BLOQUEADO
        // conta.senha = "senhahaqueada123"; ....... BLOQUEADO


        
        // consultar saldo

        System.out.println("saldo: " +  conta.getSaldo());
        System.out.println("titular: " + conta.getTitular());

        // depositando

        conta.depositar(500.0);

        System.out.println("Testando novo saldo da conta:");
        System.out.println("novo saldo eh: " + conta.getSaldo());

        //sacando com validacao de senha correta:
        conta.sacar(100.0, "1234");
        System.out.println("novo saldo da conta depois do saque: " + conta.getSaldo());

        // validaçao de senha incorreta
        System.out.println("testando validaçao incorreta");

        conta.sacar(1000,"12345");

        System.out.println("testando trocar a senha");
        conta.alterarSenha("1234","123");
        

        // tesstando nova asenha com o metodo sacar 

        conta.sacar(100.0, "123");
        System.err.println("novo saldo da conta eh: " + conta.getSaldo());


    }
    
}
