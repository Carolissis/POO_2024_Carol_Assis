public class Jogador {
    
    private String nome;
    private int pontuacao;
    private int moedas;

    public Jogador(String nome, int pontuacaoInicial, int moedasInicial){
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.moedas = moedasInicial;
    }

    public void atualizarPontos(int qnt) {
        this.pontos += qnt;
    }
    
    public int mostrarPontos() {
        return this.pontos;
    }
}