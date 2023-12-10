package Item.Equipavel.Arma;

import Ataques.Jogador.SemAtaque;

public class SemArma extends Arma{
    public SemArma() {
        super("Sem arma", 0, 0, 0, 0, new SemAtaque());
    }
}
