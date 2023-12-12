package Ataques;

import Entidade.Entidade;
import Ataques.Ataque;
import Item.Equipavel.Arma.Arma;

public class MonstroAtaque extends Ataque {

    private int dano;

    public MonstroAtaque(int dano) {
        this.dano = dano;
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        alvo.receberDano(this.dano);
    }

    public int getDano() {
        return dano;
    }
}
