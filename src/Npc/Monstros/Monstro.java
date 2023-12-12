package Npc.Monstros;

import Ataques.MonstroAtaque;
import Entidade.Jogador;
import Npc.Npc;

public class Monstro extends Npc implements Comparable<Monstro> {

    private String especie;
    private String tipo;
    private MonstroAtaque ataque;

    public Monstro(int vida, String especie, String tipo, MonstroAtaque ataque) {
        super("Monstro", vida, "Agressivo");
        this.especie = especie;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public void atacar(Jogador alvo) {
        ataque.atacar(null, alvo); // o monstro nao utiliza arma para atacar, logo é passado null para este campo
    }

    @Override
    public int compareTo(Monstro monstro) {
        double vida = monstro.getVida();
        double dano = monstro.getAtaque().getDano();
        double coeficienteComp = vida * dano;
        double coeficienteCompThis = this.getVida() * this.ataque.getDano();
        if (coeficienteCompThis > coeficienteComp) {
            System.out.println("O monstro" + this + "é mais forte que o monstro " + monstro);
            return 1;
        } else if (coeficienteCompThis < coeficienteComp) {
            System.out.println("O monstro" + this + "é mais fraco que o monstro " + monstro);
            return 1;
        } else {
            System.out.println("Os monstros: " + this + " e " + monstro + "sao iguais na força");
            return 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Monstro{" +
                "especie='" + especie + '\'' +
                ", ataque=" + ataque +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass() && this.especie == ((Monstro) obj).especie;
    }


    public MonstroAtaque getAtaque() {
        return ataque;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipo() {
        return tipo;
    }

}
