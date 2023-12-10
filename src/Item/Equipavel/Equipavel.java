package Item.Equipavel;

import Item.Item;

// POSSIBILIDADE DE TORNAR INTERFACE

public class Equipavel extends Item{

    private String tipo; // ARMA OU ARMADURA

    public Equipavel(String nome, double precoCompra, double precoVenda, String tipo) {
        super(nome, "Equipável", precoCompra, precoVenda);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
