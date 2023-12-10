package Item;

import Item.Equipavel.Arma.Arma;
import Item.Equipavel.Arma.SemArma;
import Item.Usavel.Pocoes.Pocao;
import Item.Usavel.Pocoes.PocaoVermelha;

public class Inventario {

    private Pocao pocao1;
    private Pocao pocao2;
    private Pocao pocao3;
    private Item item1;
    private Item item2;
    private Item item3;
    //private Boolean bote;
    //private Boolean cavalo;
    //private Boolean vassoura;
    private Arma arma1;
    private Arma arma2;
    private Arma arma3;
    private Arma arma4;
    private Arma arma5;
    private Arma arma6;
    private Arma arma7;


    public Inventario() {
        this.pocao1 = new PocaoVermelha();
        this.pocao2 = new PocaoVermelha();
        this.pocao3 = new PocaoVermelha();

        this.item1 = new SemItem();
        this.item2 = new SemItem();
        this.item3 = new SemItem();

        this.arma1 = new SemArma();
        this.arma2 = new SemArma();
        this.arma3 = new SemArma();
        this.arma4 = new SemArma();
        this.arma5 = new SemArma();
        this.arma6 = new SemArma();
        this.arma7 = new SemArma();
    }

    @Override
    public String toString() {
        return "INVENTARIO\n" + "Pocao1: " + pocao1.getNome() + " | usada : " + this.pocao1.foiUsada()
                + "\nPocao2: " + pocao2.getNome() + " | usada : " + this.pocao2.foiUsada() + "\nPocao3: "
                + pocao3.getNome() + " | usada : " + this.pocao3.foiUsada() + "\nItem1: " + item1.getNome()
                + "\nItem2: " + item2.getNome() + "\nItem2: " + item3.getNome() + "\nArma1: " +  arma1.getNome()
                + "\nArma2: " +  arma2.getNome() + "\nArma3: " +  arma3.getNome() + "\nArma4: " +  arma4.getNome()
                + "\nArma5: " +  arma5.getNome() + "\nArma6: " +  arma6.getNome() + "\nArma7: " +  arma7.getNome()
//                + "\nBote: " + getBote() + "\nCavalo: " + getCavalo() + "\nVassoura: " + getVassoura() + "\n";
                + "\n";
    }

    public Pocao getPocao1() {
        return pocao1;
    }

    public void setPocao1(Pocao pocao1) {
        this.pocao1 = pocao1;
    }

    public Pocao getPocao2() {
        return pocao2;
    }

    public void setPocao2(Pocao pocao2) {
        this.pocao2 = pocao2;
    }

    public Pocao getPocao3() {
        return pocao3;
    }

    public void setPocao3(Pocao pocao3) {
        this.pocao3 = pocao3;
    }

    public Item getItem1() {
        return item1;
    }

    public void setItem1(Item item1) {
        this.item1 = item1;
    }

    public Item getItem2() {
        return item2;
    }

    public void setItem2(Item item2) {
        this.item2 = item2;
    }

    public Item getItem3() {
        return item3;
    }

    public void setItem3(Item item3) {
        this.item3 = item3;
    }

    public Arma getArma1() {
        return arma1;
    }

    public void setArma1(Arma arma1) {
        this.arma1 = arma1;
    }

    public Arma getArma2() {
        return arma2;
    }

    public void setArma2(Arma arma2) {
        this.arma2 = arma2;
    }

    public Arma getArma3() {
        return arma3;
    }

    public void setArma3(Arma arma3) {
        this.arma3 = arma3;
    }

    public Arma getArma4() {
        return arma4;
    }

    public void setArma4(Arma arma4) {
        this.arma4 = arma4;
    }

    public Arma getArma5() {
        return arma5;
    }

    public void setArma5(Arma arma5) {
        this.arma5 = arma5;
    }

    public Arma getArma6() {
        return arma6;
    }

    public void setArma6(Arma arma6) {
        this.arma6 = arma6;
    }

    public Arma getArma7() {
        return arma7;
    }

    public void setArma7(Arma arma7) {
        this.arma7 = arma7;
    }

//    public Boolean getBote() {
//        return bote;
//    }
//    public void setBote(Boolean bote) {
//        this.bote = bote;
//    }

//    public Boolean getCavalo() {
//        return cavalo;
//    }
//
//    public void setCavalo(Boolean cavalo) {
//        this.cavalo = cavalo;
//    }
//
//    public Boolean getVassoura() {
//        return vassoura;
//    }

    //public void setVassoura(Boolean vassoura) {
      //  this.vassoura = vassoura;
    //}
}
