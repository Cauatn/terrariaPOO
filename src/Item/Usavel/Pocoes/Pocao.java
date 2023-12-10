package Item.Usavel.Pocoes;

import Entidade.Entidade;
import Item.Usavel.Usavel;

public abstract class Pocao extends Usavel{

    protected boolean foiUsada = false;

    public Pocao(String nome, double precoCompra, double precoVenda, String descricao) {
        super(nome, precoCompra, precoVenda, "Poção", descricao);
    }

    public abstract void usarPocao(Entidade alvo);

    @Override
    public void mostrarCampos() {
        super.mostrarCampos();
        System.out.println("Tipo: " + super.getTipo());
        System.out.println("Efeito: " + super.getDescricao());
    }

    public boolean foiUsada() {
        return foiUsada;
    }

}
