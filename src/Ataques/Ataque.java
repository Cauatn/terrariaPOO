package Ataques;

import Entidade.Entidade;
import Item.Equipavel.Arma.Arma;

public abstract class Ataque {

    public abstract void atacar(Arma armaUsada, Entidade alvo);
}