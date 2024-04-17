// 1. Defina uma classe Animal com métodos comuns, como comer() e
// comunicar().
// 2. Crie subclasses para diferentes tipos de animais, como Cachorro, Gato
// e Pássaro, e implemente métodos específicos para cada um, como
// latir(), miar() e cantar().
// 3. Utilize polimorfismo para chamar os métodos comer() e comunicar() de
// diferentes instâncias de animais.
// 4. Explore o conceito de sobrescrita de métodos, alterando o
// comportamento padrão de algum método em uma subclasse.

public class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Macaco");
        animal.comer();
        animal.comunicar();
        Cachorro cachorro = new Cachorro("Tody", 5);
        cachorro.comer();
        cachorro.comunicar();
        cachorro.exibirCachorro();
        Gato gato = new Gato("Mia");
        gato.comer();
        gato.comunicar();
        Passaro passaro = new Passaro("Molly");
        passaro.comer();
        passaro.comunicar();
    }
}

class Animal{
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void comer(){
        System.out.println("Animal come");
    }
    public void comunicar(){
        System.out.println("Animal se comunica");
    }
}
class Cachorro extends Animal{
    private int idade;

    public Cachorro(String nome, int idade){
        super(nome);
        this.idade = idade;
    }
    @Override
    public void comer(){
        System.out.println("Cachorro come");
    }
    @Override
    public void comunicar(){
        System.out.println("Au Au");
    }
    public void exibirCachorro(){
        System.out.println(getNome() + " tem " + this.idade + " anos!");
    }
}
class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }
    @Override
    public void comer(){
        System.out.println("Gato come");
    }
    @Override
    public void comunicar(){
        System.out.println("Miau");
    }
}
class Passaro extends Animal{

    public Passaro(String nome){
        super(nome);
    }
    @Override
    public void comer(){
        System.out.println("Passaro come");
    }
    @Override
    public void comunicar(){
        System.out.println(getNome() + ": Piu Piu");
    }
}