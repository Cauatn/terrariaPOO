package Entidade;

import Item.Inventario;
import Item.Equipavel.Arma.*;
import Item.Equipavel.armadura.Armadura;
import Item.Equipavel.armadura.TunicaVerde;
import Item.Equipavel.escudo.Escudo;

public class Jogador extends entidade.Entidade {

    private String nomeUsuario;
    private int rupee;
    private double energia;
    private boolean estaDefendendo = false;

    //Itens Equipados
    private Arma espada;
    private Arma armaPrimaria;
    private Arma armaSecundaria;
    private Escudo escudo;
    private Armadura armadura;

    //Itens que o jogador possui
    private Inventario inventario;

    public Jogador(String nomeUsuario){
        super("Jogador");
        this.nomeUsuario = nomeUsuario;
        this.energia = 100;
        this.rupee = 0;
        initEquipamentos();
        initInventario();
    }

    private void initEquipamentos(){
        this.espada = new EspadaEsquecida();
        this.armaPrimaria = new SemArma();
        this.armaSecundaria = new SemArma();
        this.escudo = null;
        this.armadura = new TunicaVerde();
    }

    private void initInventario(){
        this.inventario = new Inventario();
    }

    public void usarPocao(int slot){
        switch(slot){
            case 1:
                inventario.getPocao1().usarPocao(this);
                break;
            case 2:
                inventario.getPocao2().usarPocao(this);
                break;
            case 3:
                inventario.getPocao3().usarPocao(this);
                break;
            default:
                System.out.println("Slot inserido não é válido, nenhuma poição utilziada");

        }
    }

    public String invToString(){
        return this.inventario.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "Jogador{" +
                "nome='" + nomeUsuario + '\'' +
                ", rupee=" + rupee +
                ", energia=" + energia +
                ", estaDefendendo=" + estaDefendendo +
                ", espada=" + espada +
                ", armaPrimaria=" + armaPrimaria +
                ", armaSecundaria=" + armaSecundaria +
                ", escudo=" + escudo +
                ", armadura=" + armadura +
                '}';
    }

    public void escudo(){
        if(this.escudo != null){
            swtichEstaDefendendo();
        } else {
            System.out.println("Jogador nao possui escudo equipado");
        }

    }

    private void swtichEstaDefendendo(){
        this.estaDefendendo = !this.estaDefendendo;
    }

    @Override
    public void receberDano(double dano) {
        if(estaDefendendo){
            System.out.println(this.getNomeUsuario() + " defendeu o ataque");
        } else {
            dano = checarNivelArmadura(dano);
            super.receberDano(dano);
        }
    }

    private double checarNivelArmadura(double dano){ // diminuir o dano baseando-se no nivel da armadura do jogador
        int nivelArmadura = armadura.getNivelDefesa();
        switch(nivelArmadura){ // diminuir o dano baseado no nivel da armadura
            case 2:
                dano = dano * (0.5); // armadura nivel 2 diminui o dano na metade
                break;
            case 3:
                dano = (dano * (0.5)) * (0.5); // armadura nv 3 diminui o dano na metade da metade
                break;
            default: // dano = dano
        }
        return dano;
    }

    public void equiparArmaPrimaria(Arma novaArma){
        this.armaPrimaria = novaArma;
    }

    public void equiparArmaSecundaria(Arma novaArma){
        this.armaSecundaria = novaArma;
    }

    public void trocarArmaPrimaria(int slot){
        Arma aux = new Arma(this.armaPrimaria);
        switch(slot){
            case 1:
                this.armaPrimaria = this.inventario.getArma1();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma1().getNome());
                this.inventario.setArma1(aux);
                return;
            case 2:
                this.armaPrimaria = this.inventario.getArma2();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma2().getNome());
                this.inventario.setArma2(aux);
                return;
            case 3:
                this.armaPrimaria = this.inventario.getArma3();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma3().getNome());
                this.inventario.setArma3(aux);
                return;
            case 4:
                this.armaPrimaria = this.inventario.getArma4();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma4().getNome());
                this.inventario.setArma4(aux);
                return;
            case 5:
                this.armaPrimaria = this.inventario.getArma5();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma5().getNome());
                this.inventario.setArma5(aux);
                return;
            case 6:
                this.armaPrimaria = this.inventario.getArma6();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma6().getNome());
                this.inventario.setArma6(aux);
                return;
            case 7:
                this.armaPrimaria = this.inventario.getArma7();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma7().getNome());
                this.inventario.setArma7(aux);
                return;
            default:
                System.out.println("Slot inválido, não foi possível realizar a troca das armas");
        }
    }

    public void trocarArmaSecundaria(int slot){
        Arma aux = new Arma(this.armaSecundaria);
        switch(slot){
            case 1:
                this.armaSecundaria = this.inventario.getArma1();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma1().getNome());
                this.inventario.setArma1(aux);
                return;
            case 2:
                this.armaSecundaria = this.inventario.getArma2();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma2().getNome());
                this.inventario.setArma2(aux);
                return;
            case 3:
                this.armaSecundaria = this.inventario.getArma3();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma3().getNome());
                this.inventario.setArma3(aux);
                return;
            case 4:
                this.armaSecundaria = this.inventario.getArma4();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma4().getNome());
                this.inventario.setArma4(aux);
                return;
            case 5:
                this.armaSecundaria = this.inventario.getArma5();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma5().getNome());
                this.inventario.setArma5(aux);
                return;
            case 6:
                this.armaSecundaria = this.inventario.getArma6();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma6().getNome());
                this.inventario.setArma6(aux);
                return;
            case 7:
                this.armaSecundaria = this.inventario.getArma7();
                System.out.println(aux.getNome() + " trocada por " + this.inventario.getArma7().getNome());
                this.inventario.setArma7(aux);
                return;
            default:
                System.out.println("Slot inválido, não foi possível realizar a troca das armas");
        }
    }




    public void equiparEscudo(Escudo novoEscudo){
        this.escudo = novoEscudo;
    }

    public void trocarArmadura(Armadura novaArmadura){
        this.armadura = novaArmadura;
    }

    private void atacar(entidade.Entidade alvo, Arma arma){
        double energiaNecessaria = arma.getEnergia();
        if((this.energia - energiaNecessaria) < 0){
            System.out.println("Energia insuficiente para atacar.");
        } else {
            arma.atacar(alvo);
            reduzirEnergia(energiaNecessaria);
            System.out.println("Energia: -" + energiaNecessaria + ". Restante: " + this.energia);
        }
    }

    private void atacar(entidade.Entidade alvo){ // quando nao for passado nenhuma arma para o metodo atacar o jogador vai atacar utilizando sua espada por padrao
        this.espada.atacar(alvo);
    }

    public void atacarEspada(entidade.Entidade alvo){
        atacar(alvo);
    }

    public void atacarPrimaria(entidade.Entidade alvo){
        if(this.armaPrimaria != null){
            atacar(alvo, this.armaPrimaria);
        }else {
            System.out.println("Jogador não possui arma primaria equipada");
        }
    }

    public void atacarSecundaria(entidade.Entidade alvo){
        if(this.armaSecundaria != null){
            atacar(alvo, this.armaSecundaria);
        } else {
            System.out.println("Jogador não possui arma secundaria equipada");
        }
    }

    public void reduzirEnergia(double energia){
        this.energia = this.energia - energia;
    }

    public void restaurarEnergia(double energiaRestaurada){
        this.energia = this.energia + energiaRestaurada;
        if(this.energia > 100) {
            this.energia = 100; // energia nao pode ultrapassar o limite de 100
        }
    }

    public void mostrarEquipamentos(){
        System.out.println("ITENS EQUIPADOS:");
        System.out.println("Espada: " + this.espada.getNome());
        System.out.println("Arma primaria: " + this.armaPrimaria.getNome() + "\t\t\tArma secundaria: " + this.armaSecundaria.getNome());
    }

    public void alterarNome(String nome){
        this.nomeUsuario = nome;
        System.out.println("Nome do jogador alterado.");
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEstaDefendendo(boolean estaDefendendo) {
        this.estaDefendendo = estaDefendendo;
    }

    public String getEspadaNome(){
        return this.espada.getNome();
    }

    public void setEspada(Arma espada) {
        this.espada = espada;
    }


    public String getArmaPrimariaNome(){
        return this.armaPrimaria.getNome();
    }

    public String getArmaSecundariaNome(){
        return this.armaSecundaria.getNome();
    }

    public int getRupee() {
        return rupee;
    }

    public void SomarRupee(int Rupee){
        rupee = rupee + Rupee;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public static void main(String[] args){
        Jogador teste = new Jogador("TESTE");

        teste.equiparArmaPrimaria(new Arco());

        System.out.printf(teste.invToString());

        teste.mostrarEquipamentos();
        System.out.println();

        teste.trocarArmaPrimaria(1);
        teste.trocarArmaSecundaria(2);

        teste.mostrarEquipamentos();
        System.out.println(teste.invToString());
    }
}