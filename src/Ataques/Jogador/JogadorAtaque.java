package Ataques.Jogador;

import Ataques.Ataque;
import Entidade.Entidade;
import Item.Equipavel.Arma.Arma;

public class JogadorAtaque extends Ataque {

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        int danoArma = armaUsada.getDano();
        alvo.receberDano(danoArma);
    }
}
