package Lugares;

import Item.Inventario;
import Jogo.Jogo;
//import Npc.monstro.Monstro;
public class Casa extends Lugar{

    public Casa() {
        super("Casa");
    }

    @Override
    public void Acoes() {
        super.Acoes();
        System.out.println("Sem Monstros");
        System.out.println("Sem Personagens");
    }

    @Override
    public void Personagens() {
        super.Personagens();
    }

//    @Override
//    public Monstro Monstros() {
//        return super.Monstros();
//    }

    @Override
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario);
    }

}
