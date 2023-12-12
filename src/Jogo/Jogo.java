package Jogo;

import java.util.Scanner;
import Entidade.Entidade;
import Entidade.Jogador;
import Lugares.Lugar;
import Lugares.Casa;
import Item.Item;
import Npc.Monstros.Monstro;

public class Jogo {

    private Jogador usuario = new Jogador("SemNome");
    private final Scanner scIn = new Scanner(System.in);
    private boolean jogoAberto = false;

    //private final Drop drops = new Drop();
    private Lugar Lugar  = new Casa();

    public Jogo() {
        initJogador();
        jogoAberto = true;
    }


    public void menuUsuario(){
        int escolhaUsuario;
        int armaEscolha = 0;
        do{
            System.out.println(this.Lugar.getNome());
            this.usuario.mostrarEquipamentos();
            System.out.println(this.usuario.invToString());
            System.out.println("MENU DE ESCOLHAS DO USUARIO:\n1- Usar poção\n2- Trocar arma primária\n3- Mudar de Lugar\n4- Batalhar com Monstro\n5- Falar com Personagem\n0- Fechar o menu");
            Lugar.Acoes();
            escolhaUsuario = Integer.parseInt(scIn.nextLine());
            switch(escolhaUsuario){
                case 0:
                    System.out.println("Menu fechado.");
                    this.fechar();
                    return;
                case 1:
                    System.out.println("Escolha qual pocao quer usar: ");
                    int pocaoEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.usarPocao(pocaoEscolha);
                    break;
                case 2:
                    System.out.println("Escolha qual o slot da arma quer equipar como primaria: ");
                    armaEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.trocarArmaPrimaria(armaEscolha);
                    break;
                case 3:
                    Lugar = Lugar.Lugares(usuario.getInventario());
                    break;
                case 4:
                    batalha(Lugar.Monstros());
                    break;
                case 5:
                    Lugar.Personagens();
                    break;
                default:
                    System.out.println("Opção inválida, menu fechado");
                    this.fechar();
            }
        }while(jogoAberto);
    }

    private void printDadosBatalha(Jogador jogador, Monstro monstro){
        System.out.println("Jogador>>\nVida: " + jogador.getVida());
        System.out.println("Monstro>>\nVida: " + monstro.getVida());
    }

    public void batalha(Monstro monstro){
        if( monstro.getVida() < 1){
            return;
        }
        System.out.println("Batalha iniciada contra " + monstro.getEspecie());
        printDadosBatalha(this.usuario, monstro);
        do{
            if(this.usuario.estaMorto()){
                System.out.println("O jogador morreu, batalha encerrada");
                return;
            }

            int escolhaUsuario = 0;
            System.out.println(this.usuario.getNomeUsuario() + " escolha o que irá fazer: \n1- Atacar \n2- Defender \n3- Atacar usando arma primaria\n5- Abrir inventario");
            escolhaUsuario = Integer.parseInt(scIn.nextLine());
            switch (escolhaUsuario) {
                case 1:
                    this.usuario.atacarEspada(monstro);
                    break;
                case 3:
                    this.usuario.atacarPrimaria(monstro);
                    break;
                case 5:
                    System.out.println(this.usuario.invToString());
                    System.out.println("Escolha qual pocao quer usar: ");
                    int pocaoEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.usarPocao(pocaoEscolha);
                    break;
                default:
                    System.out.println("Escolha inválida, o jogador perdeu o turno");
            }
            monstro.atacar(this.usuario);
            this.usuario.setEstaDefendendo(false);
            printDadosBatalha(this.usuario, monstro);
        }while(!this.usuario.estaMorto() || !monstro.estaMorto());
    }

    public void fechar(){
        System.out.println("Jogo encerrado. ");
        contagemObjetos();
        this.usuario = null;
        this.scIn.close();
        jogoAberto = false;
    }

    private void contagemObjetos(){
        System.out.println("Contagem de objetos:\nEntidades: " + Entidade.getCont() + ", Itens: " + Item.getCont() + " \n");
    }

    private void initJogador(){
        System.out.println("Insira o nome do seu jogador: ");
        String nome = scIn.nextLine();
        this.usuario.alterarNome(nome);
    }

}
