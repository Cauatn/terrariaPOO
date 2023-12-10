package Item.Usavel;

import Item.Item;

// POSSIBILIDADE DE TORNAR INTERFACE

public class Usavel extends Item{

    private String tipo; // POCAO, FRUTA, etc..
    private String descricao;

    public Usavel(String nome, double precoCompra, double precoVenda, String tipo, String descricao) {
        super(nome, "Usável", precoCompra, precoVenda);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
