package Lugares;

import Item.Inventario;
import Npc.Monstros.Monstro;

public class Dungeon extends Lugar{

    public Dungeon() {
        super("Dungeon");
    }

    @Override
    public void Acoes() {
        super.Acoes();
    }

    @Override
    public void Personagens() {
        super.Personagens();
    }

    @Override
    public Monstro Monstros() {
        return super.Monstros();
    }

    @Override
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario);
    }

}
