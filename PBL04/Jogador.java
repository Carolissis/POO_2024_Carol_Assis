import java.util.ArrayList;

public class Jogador{

    private String nome;
    private int pontuacao;
    private ArrayList<Integer> moedas;

    public Jogador(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.moedas = new ArrayList<>();
    }
    public Jogador(String nome, int pontuacao, ArrayList<Integer> moedas){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.moedas = moedas;
    }
    public void atualizarPontucao(int pontos){
        this.pontuacao = pontos;
    }
    public int getPontuacao(){
        return this.pontuacao;
    }
    public ArrayList<Integer> getMoedas(){
        return this.moedas;
    }
    public String getNome(){
        return this.nome;
    }


}