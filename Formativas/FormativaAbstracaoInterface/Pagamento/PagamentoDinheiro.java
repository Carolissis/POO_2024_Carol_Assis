public class PagamentoDinheiro implements IPagamento{

    private boolean pago;
    private double troco;

    public void efetuarPagamento(){
        this.pago = true;
    }
    public double calcularTroco(double valorPago, double valorItem){
        this.troco = valorPago - valorItem;
        return this.troco;
    }
}