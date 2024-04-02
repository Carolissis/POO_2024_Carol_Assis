public class Guerreiro extends Personagem{
    private String arma;

    public Guerreiro(String nome, int vidas, String arma){
        super(nome, vidas);
        this.arma = arma;
    }
    public String getArma(){
        return this.arma;
    }
    public void setArma(String arma){
        this.arma = arma;
    }
}