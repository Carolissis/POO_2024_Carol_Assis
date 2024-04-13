public class Cachorro extends Animal{
    private boolean andando;

    public void emitirSom(){
        System.out.printf("Au Au");
    }
    public void mover(){
        this.andando = true;
    }
}