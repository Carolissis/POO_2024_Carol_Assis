public class Vestido extends Roupa{
    private int comprimento;

    public Vestido(String cor, int tamanho, int comprimento){
        super(cor, tamanho);
        this.comprimento = comprimento;
    }
    public void cortarVestido(int tamCorte){
        this.comprimento -=  tamCorte;
    }
}