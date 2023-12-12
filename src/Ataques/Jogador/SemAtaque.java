package Ataques.Jogador;

import Entidade.Entidade;
import Item.Equipavel.Arma.Arma;

public class SemAtaque extends JogadorAtaque {
    public SemAtaque() {
        super();
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("O jogador nao possui arma equipada.");
        super.atacar(armaUsada, alvo);
    }
}
