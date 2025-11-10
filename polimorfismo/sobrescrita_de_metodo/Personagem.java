package polimorfismo.sobrescrita_de_metodo;

// CLASSE MAE
public class Personagem {

    public void atacar(){
        System.out.println("o personagem ataca!");
    }
    
}

// SUBCLASSE 1

class Guerreiro extends Personagem {
    @Override
    public void atacar(){
        System.out.println("o guerreito ataca com a ESPADA");
    }
}

// SUBCLASSE 2

class Mago extends Personagem {
    @Override
    public void atacar(){
        System.out.println("o mago ataca com uma BOLA DE FOGO");
    }
}

// CLASSE ARENA
class Arena {
    public void iniciarAtaque(Personagem p){
        p.atacar(); //o comportamento muda dependendo da subclasse
    }
}

// CLASSE PRINCIAPAL

class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        Personagem g = new Guerreiro();
        Personagem m = new Mago();

        arena.iniciarAtaque(g); // chama o atacar() do Guerreiro
        arena.iniciarAtaque(m); // chama o atacar() do Mago 
    }

}

