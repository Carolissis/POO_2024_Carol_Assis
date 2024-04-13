public class PagamentoCartao implements IPagamento{

    private boolean pago;

    public void efetuarPagamento(){
        this.pago = true;
    }
}