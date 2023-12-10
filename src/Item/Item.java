package Item;
public class Item {

    private String nome;
    private String tipo; // EQUIPAVEL OU USPAVEL
    private double precoCompra;
    private double precoVenda;
    private static int itemCont;

    public Item(String nome, String tipo, double precoCompra, double precoVenda) {
        this.nome = nome;
        this.tipo = tipo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        itemCont++;
    }

    public void mostrarCampos(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço de compra: " + precoCompra);
        System.out.println("Preço de venda: " + precoVenda);
    }

    public String getNome() {
        return nome;
    }

    public static int getCont(){
        return itemCont;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public static int getItemCont() {
        return itemCont;
    }
}
