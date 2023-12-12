package Lugares;

import java.util.Scanner;
import Npc.Guia;
public class Personagens {

    private final Scanner scIn = new Scanner(System.in);

    public void Personagens(String Lugar){
        int Escolha = 0;
        if(Lugar == "Dungeon"){
            System.out.println("1- Falar com Guia");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    break;
                case 1:
                    Guia guia = new Guia();
                    Guia.fala();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            return;
        }
//        if(Lugar == "Cartomante"){
//            System.out.println("1- Falar com Yuga");
//            System.out.println("2- Falar com Ganon");
//            System.out.println("0- Sair");
//            Escolha = Integer.parseInt(scIn.nextLine());
//            switch(Escolha){
//                case 0:
//                    break;
//                case 1:
//                    YugaPersonagem yuga = new YugaPersonagem();
//                    yuga.fala();
//                    break;
//                case 2:
//                    Ganon ganon = new Ganon();
//                    ganon.fala();
//                    break;
//                default:
//                    System.out.println("Opcao invalida!");
//                    break;
//            }
//            return;
//        }
//        if(Lugar == "Santuario"){
//            System.out.println("1- Falar com Princesa Hilda");
//            System.out.println("2- Falar com Princesa Zelda");
//            System.out.println("0- Sair");
//            Escolha = Integer.parseInt(scIn.nextLine());
//            switch(Escolha){
//                case 0:
//                    break;
//                case 1:
//                    PrincesaHilda hilda = new PrincesaHilda();
//                    hilda.fala();
//                    break;
//                case 2:
//                    PrincesaZelda zela = new PrincesaZelda();
//                    zela.fala();
//                    break;
//                default:
//                    System.out.println("Opcao invalida!");
//                    break;
//            }
//            return;
//        }
        return;
    }
}
