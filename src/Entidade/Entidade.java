package Entidade;

public class Entidade {
    private String tipo;
    private double vida; // 4 de vida = 1 coracao
    private int vidaMax = 12;
    private static int entidadeCont;

    public Entidade(String tipo, double vida) {
        this.tipo = tipo;
        this.vida = vida;
        entidadeCont++;
    }

    public Entidade(String tipo) {
        this.tipo = tipo;
        iniciaizarAtributos(this);
        this.tipo = tipo;
        entidadeCont++;
    }

    public Entidade(int vida) {
        this.vida = vida;
        this.tipo = "Sem nome";
        entidadeCont++;
    }

    public Entidade(){
        iniciaizarAtributos(this);
        this.tipo = "Sem tipo";
        entidadeCont++;
    }

    private void iniciaizarAtributos(Entidade entidade){
        entidade.vida = 12;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "vida=" + vida +
                '}';
    }

    public double getVida() {
        return vida;
    }

    public void receberDano(double dano){
        if (dano <= 1){
            dano = 1; // o menor dano que uma entidade pode receber é 1. Acrescentando um pouco de dificultdade ao jogo
        }
        this.vida = this.vida - (int)dano;
        if(this.vida < 0) this.vida = 0;
        System.out.println(this.tipo + " recebeu " + (int)dano + " de dano");
    }

    public boolean estaMorto(){
        return this.vida <= 0;
    }

    public void curar(int vida){
        this.vida += vida;
        if(this.vida + vida >= this.vidaMax){
            this.vida = 12;
        }
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getCont(){
        return entidadeCont;
    }

    public String getTipo() {
        return tipo;
    }
}
