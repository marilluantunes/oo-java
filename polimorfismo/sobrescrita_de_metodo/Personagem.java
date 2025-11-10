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


