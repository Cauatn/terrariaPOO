package npc.monstro;

import Ataques.Monstro.TarosAtaque;
import Npc.Monstros.Monstro;

public class SemMonstro extends Monstro {

    public SemMonstro() {
        super(0, "Sem Monstro", "Nenhum", new TarosAtaque());
    }


}
