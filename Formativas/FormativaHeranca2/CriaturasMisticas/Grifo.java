public class Grifo extends Criatura{
    private boolean voar;

    public Grifo(String nome, String poderAtaque, boolean voar){
        super(nome, poderAtaque);
        this.voar = voar;
    }
    public void estarVoando(){
        this.voar = true;
    }
}