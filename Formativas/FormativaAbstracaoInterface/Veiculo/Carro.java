public class Carro extends Veiculo{

    private boolean acelerar;
    private boolean freiar;

    @Override
    public void acelerar(){
        this.acelerar = true;
    }
    @Override
    public void freiar(){
        this.freiar = true;
    }
}