public class Gato extends Animal{
    private boolean andando;

    public void emitirSom(){
        System.out.printf("Miau");
    }
    public void mover(){
        this.andando = true;
    }
}