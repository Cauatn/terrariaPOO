package Npc.Monstros;

import Ataques.Monstro.SkeletonAtaque;

public class Skeleton extends Monstro{

    public Skeleton() {
        super(14, "Skeletron","Boss", new SkeletonAtaque());
    }
}
