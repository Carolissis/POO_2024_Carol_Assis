import java.util.List;

public class Cliente{

    private String nomeCliente;
    private List<Pedido> pedidos;

    public Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public String getNome(nomeCliente){
        return nomeCliente;
    }

}