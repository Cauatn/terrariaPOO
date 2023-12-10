package Ataques.Jogador;

import Ataques.Ataque;
import Entidade.Entidade;
import Item.Equipavel.Arma.Arma;

public class JogadorAtaque extends Ataque {

    private double gastoEnergia; // gasto de energia do jogador ao utilizar o ataque

    public JogadorAtaque(double gastoEnergia) {
        super();
        this.gastoEnergia = gastoEnergia;
    }

    public double getGastoEnergia() {
        return gastoEnergia;
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        int danoArma = armaUsada.getDano();
        alvo.receberDano(danoArma);
    }
}
