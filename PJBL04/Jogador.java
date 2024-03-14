public class Jogador{

    private String nome;
    private int pontuacao;
    private ArrayList<int> moedas;

    public Jogador(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    public Jogador(String nome, int pontuacao, int[]moedas){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.moedas = moedas;
    }


}