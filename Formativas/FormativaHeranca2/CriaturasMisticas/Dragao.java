public class Dragao extends Criatura{
    private boolean fogo;

    public Dragao(String nome, String poderAtaque, boolean fogo){
        super(nome, poderAtaque);
        this.fogo = fogo;
    }
    public void cuspirFogo(){
        this.fogo = true;
    }
}