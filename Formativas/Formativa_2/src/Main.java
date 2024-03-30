public class Main {
    public static void main(String[] args) {
        Pedidos p = new Pedidos();
        p.addProdutos(); // populou a lista interna de produtos.

        Clientes c = new Clientes();
        c.addPedidos(p); // populou a lista de pedidos com 1 item
        c.addPedidos(p); // populou a lista de pedidos com +1 item
        c.addPedidos(p); // populou a lista de pedidos com +1 item

        int i = 0;
        for(Pedidos item: c.getPedidos()){
            System.out.printf("Para o pedido %d: \n",i);
            for(String s: item.getProdutos()){
                System.out.println(">>" + s);
            }
            i++;
        }
    }
}