import java.util.ArrayList;

public class Pedidos {
    private ArrayList<String> aProdutos;

    public Pedidos(){
        this.aProdutos = new ArrayList<String>();
    }

    public void addProdutos(){
        this.aProdutos.add("Novo Produto 1");
        this.aProdutos.add("Novo Produto 2");
        this.aProdutos.add("Novo Produto 3");
    }

    public ArrayList<String> getProdutos(){
        return this.aProdutos;
    }
}
