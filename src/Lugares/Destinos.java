package Lugares;

import Item.Inventario;

import java.util.Scanner;

public class Destinos {
    //existem alguns lugares que so podem ser acessador por meios de transporte especificos
    private Lugar lugar;
    private final Scanner scIn = new Scanner(System.in);

    public Lugar Destino(String Lugar, Inventario inventario){
        int Escolha = 0;
        if( Lugar == "Casa"){
            lugar = new Casa();
            //System.out.println("1- Quintal do Link");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar;
                case 1:
                    //lugar = new QuintalLink();;
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }

        return null;
    }
}
