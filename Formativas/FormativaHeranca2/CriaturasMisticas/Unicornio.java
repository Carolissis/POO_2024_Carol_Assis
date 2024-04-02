public class Unicornio extends Criatura{
    private boolean arcoIris;

    public Unicornio(String nome, String poderAtaque, boolean arcoIris){
        super(nome, poderAtaque);
        this.arcoIris = arcoIris;
    }
    public void soltarArcoIris(){
        this.arcoIris = true;
    }
}