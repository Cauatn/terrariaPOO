package Jogo;

import java.util.Scanner;
import Entidade.Entidade;
import Entidade.Jogador;
import Lugares.Lugar;
import Lugares.Casa;
import Item.Item;

//LEMBRAR :
//batalha


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
            System.out.println("MENU DE ESCOLHAS DO USUARIO:\n1- Usar poção\n2- Trocar arma primária\n3- Trocar arma secundária\n4- Mudar de Lugar\n5- Batalhar com Monstro\n6- Falar com Personagem\n0- Fechar o menu");
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
                    System.out.println("Escolha qual o slot da arma quer equipar como secundaria: ");
                    armaEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.trocarArmaSecundaria(armaEscolha);
                    break;
                case 4:
                    Lugar = Lugar.Lugares(usuario.getInventario());
                    break;
                case 5:
    //                batalha(Lugar.Monstros());
                    break;
                case 6:
                    Lugar.Personagens();
                    break;
                default:
                    System.out.println("Opção inválida, menu fechado");
                    this.fechar();
            }
        }while(jogoAberto);
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
