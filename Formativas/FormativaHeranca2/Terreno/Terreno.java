public class Terreno{
    private String nome;
    private String descriacao;

    public Terreno(String nome, String descriacao){
        this.nome = nome;
        this.descriacao = descriacao;
    }
    public String descrever(){
        return this.nome + ": " + this.descriacao;
    }
}