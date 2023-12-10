package Item.Equipavel.Armadura;

import Item.Equipavel.Equipavel;

public class Armadura extends Equipavel{

    private int nivelDefesa; // 1, 2 ou 3 >> 1: recebe dano normal, 2: recebe dano pela metade e

    public Armadura(String nome, double precoCompra, double precoVenda, int nivelDefesa) {
        super(nome, precoCompra, precoVenda, "Armadura");
        this.nivelDefesa = nivelDefesa;
    }

    public int getNivelDefesa() {
        return nivelDefesa;
    }
}
