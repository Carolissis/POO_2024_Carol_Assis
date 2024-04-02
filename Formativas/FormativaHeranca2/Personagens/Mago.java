public class Mago extends Personagem{
    private String poderMagico;

    public Mago(String nome, int vidas, String poderMagico){
        super(nome, vidas);
        this.poderMagico = poderMagico;
    }
    public String getPoderMAgico(){
        return this.poderMagico;
    }
    public void setPoderMagico(String poderMagico){
        this.poderMagico = poderMagico;
    }
}