public class Moto extends Veiculo{
    private int velocidade;

    @Override
    public void acelerar(){
        this.velocidade = 30;
    }
}