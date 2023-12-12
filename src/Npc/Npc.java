package Npc;

import Entidade.Entidade;

public class Npc extends Entidade {
    final private String comportamento; // Neutro, Passivo, Agressivo

    public Npc(String nome, int vida, String comportamento) {
        super(nome, vida);
        this.comportamento = comportamento;
    }

    @Override
    public String toString() {
        return super.toString() + "NPC{" +
                "comportamento='" + comportamento + '\'' +
                '}';
    }
}
