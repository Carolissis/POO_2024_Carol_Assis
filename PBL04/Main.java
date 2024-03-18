import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList();

        while(true){
            System.out.println("1) Adicionar um novo jogador ");
            System.out.println("2) Atualizar a pontuação de um jogador");
            System.out.println("3) Mostrar a pontuação total de um jogador");
            System.out.println("4) Mostrar o total de moedas coletadas em um determinado nível por todos os jogadores");
            System.out.println("5) Mostrar o jogador com a pontuação mais alta");
            System.out.println("6) Sair");
            System.out.printf("Opção: ");
            int opcao = ler.nextInt();
            ler.nextLine();

            if(opcao == 6){
                break;
            } else{
                switch(opcao){
                    case 1:
                        ArrayList<Integer> moedas = new ArrayList();

                        System.out.printf("Nome do jogador: ");
                        String nome = ler.nextLine();
                        System.out.printf("Pontuação inicial: ");
                        int pontos = ler.nextInt();
                        System.out.printf("Quantidade de moedas nivel 1: ");
                        int moeda1 = ler.nextInt();
                        System.out.printf("Quantidade de moedas nivel 2: ");
                        int moeda2 = ler.nextInt();
                        System.out.printf("Quantidade de moedas nivel 3: ");
                        int moeda3 = ler.nextInt();

                        moedas.add(moeda1);
                        moedas.add(moeda2);
                        moedas.add(moeda3);

                        Jogador novoJogador = new Jogador(nome, pontos, moedas);
                        jogadores.add(novoJogador);

                    case 2:
                        System.out.printf("Nome do jogador que deseja atualizar a pontuação: ");
                        String nomeAtualizar = ler.nextLine();

                        for(Jogador jogador : jogadores){
                            if(jogador.getNome() == nomeAtualizar){
                                System.out.printf("Quantos pontos? ");
                                int pontosAdicionais = ler.nextInt();

                                jogador.atualizarPontucao(pontosAdicionais);
                            }
                        }

                    default:
                        System.out.printf("Opção inválida");
                }
            }
        }

    }
}