public interface IPagamento{

    public abstract void efetuarPagamento();
    public abstract double calcularTroco(double valorPago, double valorItem);

}