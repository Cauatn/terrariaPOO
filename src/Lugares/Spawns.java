package Lugares;

import Npc.Monstros.Monstro;
import Npc.Monstros.Skeleton;

import java.util.Scanner;

public class Spawns {

    private Monstro monstro = new npc.monstro.SemMonstro();

    private final Scanner scIn = new Scanner(System.in);

    public Monstro Spawn(String Lugar){
        int Escolha = 0;
        if(Lugar == "Casa"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Dungeon"){
            System.out.println("1- Skeletron");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Skeleton();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");
                    return monstro;
            }
        }
        return null;
    }
}
