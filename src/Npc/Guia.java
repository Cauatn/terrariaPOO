package Npc;

import java.util.Scanner;

public class Guia extends Npc {
    String nome;
    int vida;
    String comportamento;

    private static final Scanner scIn = new Scanner(System.in);

    public Guia() {
        super("Guia",200,"");
    }

    public static void fala(){
        System.out.println("Voce tem certeza que quer fazer isso ?");
        String a;
        a = scIn.nextLine();
        if(a == "") {
            return;
        }
    };
}
