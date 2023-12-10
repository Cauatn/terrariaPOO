package Item.Equipavel.Arma;

import Ataques.Jogador.EspadaAtaque;

public class Espada extends Arma implements Comparable<Espada>{

    public Espada(String nome, int dano ) {
        super(nome, 0, 0, dano, 0, new EspadaAtaque());
    }

    @Override
    public int compareTo(Espada espada) {
        if(this.getDano() > espada.getDano()){
            System.out.println(this + " é mais forte que " + espada);
            return 1;
        }else if (this.getDano() == espada.getDano()){
            System.out.println(this + " tem a mesma força que " + espada);
            return 1;
        } else{
            System.out.println(this + " é mais fraca que " + espada);
            return 1;
        }
    }
}
