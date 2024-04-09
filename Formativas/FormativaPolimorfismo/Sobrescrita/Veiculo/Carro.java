public class Carro extends Veiculo{
    private int velocidade;

    @Override
    public void acelerar(){
        this.velocidade = 20;
    }
}