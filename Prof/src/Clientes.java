import java.sql.Array;
import java.util.ArrayList;

public class Clientes {
    private ArrayList<Pedidos> aPedidos;

    public Clientes(){
        this.aPedidos = new ArrayList<Pedidos>();
    }

    public void addPedidos(Pedidos p){
        this.aPedidos.add(p);
    }

    public ArrayList<Pedidos> getPedidos(){
        return this.aPedidos;
    }
}
