package Item.Usavel.Pocoes;

import Entidade.Entidade;

public class PocaoVermelha extends Pocao{

    final private int curaRealizada = 4 * 4; // 8 coracoes >> 4 de vida = 1 coracao

    public PocaoVermelha() {
        super("Poção vermelha", 0, 0, "Cura o alvo em 4 corações");
    }

    @Override
    public void usarPocao(Entidade alvo) {
        if(!foiUsada){
            alvo.curar(this.curaRealizada);
            this.foiUsada = true;
        } else{
            System.out.println("Poção já foi usada");
        }
    }
}
