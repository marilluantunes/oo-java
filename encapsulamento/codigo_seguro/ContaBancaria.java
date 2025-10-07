package encapsulamento.codigo_seguro;

public class ContaBancaria {
        //atributos privados (encapsulados)

        private double saldo;
        private String senha;
        private String titular;

        // 2 passo: construtor para inicialização controlada

        public ContaBancaria(String titular, String senha){
            this.titular = titular;
            this.senha = senha;
            this.saldo = 0.0;
        }

        // 3 passo: metodos pblicoss para acesso controlado

        // getter = permite apenas leitura

        public double getSaldo(){
            return this.saldo;
        }

        public String getTitular(){
            return this.titular;
        }

        // metodo para saque com validaçao

        public boolean sacar(double valor, String senhaDigitada){
            //valida a senha primeiro
            if (!this.senha.equals(senhaDigitada)){
                System.out.println("senha incorreta");
                return false;
            }

            // valida o valor do saque

            if (valor <= 0){
                System.out.println("valor deve ser positivo");
                return false;
            }

            if ( valor > this.saldo) {
                System.out.println("saldo insuficiente");
                return false;
            }

            // finalmente ora do saque 

            this.saldo -= valor;
            System.out.println("saque de " + valor + " realizado" );
            return true;
        }

        // metodo para deposito com validaçao

        public void depositar(double valor){
            if (valor>0){
                this.saldo += valor;
                System.out.println("deposito de " + valor + " realizado");

            } else {
                System.out.println("valor de deposito indalido");
            }
        }

        // metodo para alterar senha com validaçao

        public boolean alterarSenha(String senhaAntiga ,  String senhaNova){
            if (this.senha.equals(senhaAntiga)){
                this.senha = senhaNova;
                System.out.println("senha alterada com sucesso");
                return true;
            } else {
                System.out.println( "senha atual incorreta");
                return false;
            }
        }
    }
    

