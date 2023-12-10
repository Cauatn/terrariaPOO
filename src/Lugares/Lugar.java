package Lugares;

import Item.Inventario;
import Npc.*;

public class Lugar {

    //private Monstro monstro;
    private Lugar lugar;

    //importar npcs que estao disponiveis na area
    //private Npc npcs= new Npc();

    //private Spawns spawn = new Spawns();
    //no nosso caso spwawns sera a classe que definira qual boss voce que lutar
    private Destinos destino = new Destinos();
    String Nome;

    public Lugar(String Nome) {
        this.Nome = Nome;
    }

    public Lugar Lugares(Inventario inventario){
        System.out.println("Escolha qual Lugar voce quer ir!");
        return destino.Destino(Nome, inventario);
    }

//    public Monstro Monstros(){
//        System.out.println("Escolha qual monstro voce quer enfrentar!");
//        return spawn.Spawn(Nome);
//    }

    public void Personagens(){
        System.out.println("Personagens: ");
        personagem.Personagens(Nome);
    }

    public void Acoes(){}

    public String getNome() {
        return Nome;
    }

}
