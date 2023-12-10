package Item.Equipavel.Arma;

import Ataques.Jogador.JogadorAtaque;
import Entidade.Entidade;
import Item.Equipavel.Equipavel;

public class Arma extends Equipavel implements Cloneable{

    private int dano;
    private int precoAluguel;
    private JogadorAtaque ataqueJogador;

    public Arma(String nome, double precoCompra, double precoVenda,int dano, int precoAluguel, JogadorAtaque ataqueJogador) {
        super(nome, precoCompra, precoVenda, "Arma");
        this.dano = dano;
        this.precoAluguel = precoAluguel;
        this.ataqueJogador = ataqueJogador;
    }

    public Arma(Arma novaArma) {
        super(novaArma.getNome(), novaArma.getPrecoCompra(), novaArma.getPrecoVenda(), novaArma.getTipo());
        this.dano = novaArma.dano;
        this.precoAluguel = novaArma.precoAluguel;
        this.ataqueJogador = novaArma.ataqueJogador;
    }

    @Override
    public void mostrarCampos(){
        super.mostrarCampos();
        System.out.println("Preco aluguel: " + this.precoAluguel);
        System.out.println("Tipo: " + super.getTipo());
        System.out.println("Dano :" + this.dano);
    }

    public void atacar(Entidade alvo){
        ataqueJogador.atacar(this, alvo);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getDano() {
        return dano;
    }
}
