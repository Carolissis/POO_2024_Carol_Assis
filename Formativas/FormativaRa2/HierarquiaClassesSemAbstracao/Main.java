// 1. Crie uma hierarquia de classes para diferentes tipos de dispositivos
// eletrônicos, como celular, laptop e televisão.
// 2. Adicione métodos e atributos específicos para cada tipo de dispositivo,
// como tamanho da tela para laptops e resolução para televisões.
// 3. Implemente métodos para ligar, desligar e verificar a bateria para cada
// tipo de dispositivo.
// 4. Crie uma classe principal para testar a hierarquia de classes,
// instanciando diferentes tipos de dispositivos e chamando seus métodos

public class Main{
    public static void main(String[] args){
        Celular celular = new Celular("iphone", 127, "branco");
        Tv tv = new Tv("sansung", 227, 1088);
        Laptop laptop = new Laptop("linux", 127, 15, 23);
        celular.ligar();
        celular.tirarFoto();
        tv.desligar();
        tv.resolucaoTv();
        laptop.tamanhaTela();
    }
}
class Eletronicos{
    private String nome;
    private int voltagem;

    public Eletronicos(String nome, int voltagem){
        this.nome = nome;
        this.voltagem = voltagem;
    }
    protected void ligar(){
        System.out.println(this.nome + " está ligado");
    }
    protected void desligar(){
        System.out.println(this.nome + " está desligado");
    }
}
class Celular extends Eletronicos{
    private String cor;

    public Celular(String nome, int voltagem, String cor){
        super(nome, voltagem);
        this.cor = cor;
    }
    public void tirarFoto(){
        System.out.println("📸");
    }
    
}
class Tv extends Eletronicos{
    private int resolucao;

    public Tv(String nome, int voltagem, int resolucao){
        super(nome, voltagem);
        this.resolucao = resolucao;
    }
    public void resolucaoTv(){
        System.out.println("A resolução da tv é: " + this.resolucao);
    }
}
class Laptop extends Eletronicos{
    private double alturaTela;
    private double larguraTela;

    public Laptop(String nome, int voltagem, double alturaTela, double larguraTela){
        super(nome, voltagem);
        this.alturaTela = alturaTela;
        this.larguraTela = larguraTela;
    }
    public double tamanhaTela(){
        return this.alturaTela * this.larguraTela;
    }

}
