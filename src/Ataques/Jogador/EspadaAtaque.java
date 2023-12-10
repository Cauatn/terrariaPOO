package Ataques.Jogador;

import Ataques.Ataque;
import Entidade.Entidade;
import Item.Equipavel.Arma.Arma;

public class EspadaAtaque extends Ataque {

   // private double gastoEnergia; // gasto de energia do jogador ao utilizar o ataque

    public EspadaAtaque() {
        super();
    }

//    public double getGastoEnergia() {
//        return gastoEnergia;
//    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        int danoArma = armaUsada.getDano();
        alvo.receberDano(danoArma);
    }
}
