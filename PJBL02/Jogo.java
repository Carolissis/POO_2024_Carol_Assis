import java.util.*;

public class Jogo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] jogadores = new String[5];
        int[] pontuacoes = new int[5];
        int[] moedasNv1 = new int[5];
        int[] moedasNv2 = new int[5];
        int[] moedasNv3 = new int[5];
        int qnt = 0;

        while (true) {
            System.out.println("1) Adicionar um novo jogador com seu nome, pontuação inicial e as quantidades de moedas coletadas em cada nível.(max 5)");
            System.out.println("2) Atualizar a pontuação de um jogador após a conclusão de um nível");
            System.out.println("3) Mostrar a pontuação total de um jogador");
            System.out.println("4) Mostrar o total de moedas coletadas em um determinado nível por todos os jogadores");
            System.out.println("5) Mostrar o jogador com a pontuação mais alta");
            System.out.println("6) Sair");
            System.out.printf("Opção: ");
            int opcao = ler.nextInt();
            ler.nextLine();

            if (opcao == 6) {
                break;
            } else {

                switch (opcao) {
                    case 1:
                        if (qnt >= 5) {
                            System.out.println("Não é mais possível adicionar jogadores.");
                        } else {
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

                            jogadores[qnt] = nome;
                            pontuacoes[qnt] = pontos;
                            moedasNv1[qnt] = moeda1;
                            moedasNv2[qnt] = moeda2;
                            moedasNv3[qnt] = moeda3;

                            qnt++;
                        }
                        break;
                    case 2:
                        System.out.printf("Nome do jogador que deseja atualizar a pontuação: ");
                        String nomeAtualizar = ler.nextLine();

                        int indice = Arrays.asList(jogadores).indexOf(nomeAtualizar);

                        if (indice != -1) {
                            System.out.printf("Quantos pontos? ");
                            int pontosAdicionais = ler.nextInt();
                            pontuacoes[indice] += pontosAdicionais;
                            System.out.println(jogadores[indice] + " agora tem " + pontuacoes[indice] + " pontos.");
                        } else {
                            System.out.println("O nome " + nomeAtualizar + " não foi encontrado no jogo.");
                        }
                        break;
                    case 3:
                        System.out.printf("Nome do jogador que deseja saber a pontuação: ");
                        String nomeConsulta = ler.nextLine();

                        int indiceConsulta = Arrays.asList(jogadores).indexOf(nomeConsulta);

                        if (indiceConsulta != -1) {
                            System.out.println(nomeConsulta + " tem " + pontuacoes[indiceConsulta] + " pontos.");
                        } else {
                            System.out.println("O nome " + nomeConsulta + " não foi encontrado no jogo.");
                        }
                        break;
                    case 4:
                        System.out.printf("Qual nível: ");
                        int nivel = ler.nextInt();

                        int totalMoedas = 0;
                        switch (nivel) {
                            case 1:
                                for (int i = 0; i < qnt; i++) {
                                    totalMoedas += moedasNv1[i];
                                }
                                break;
                            case 2:
                                for (int i = 0; i < qnt; i++) {
                                    totalMoedas += moedasNv2[i];
                                }
                                break;
                            case 3:
                                for (int i = 0; i < qnt; i++) {
                                    totalMoedas += moedasNv3[i];
                                }
                                break;
                            default:
                                System.out.println("Nível inválido.");
                                continue;
                        }
                        System.out.println("Total de moedas coletadas no nível " + nivel + ": " + totalMoedas);
                        break;
                    case 5:
                        if (qnt == 0) {
                            System.out.println("Ainda não há jogadores registrados.");
                            break;
                        }
                        int maiorPontuacao = -1;
                        String jogadorComMaiorPontuacao = "";
                        for (int i = 0; i < qnt; i++) {
                            if (pontuacoes[i] > maiorPontuacao) {
                                maiorPontuacao = pontuacoes[i];
                                jogadorComMaiorPontuacao = jogadores[i];
                            }
                        }
                        System.out.println("Jogador com a maior pontuação: " + jogadorComMaiorPontuacao + " com " + maiorPontuacao + " pontos.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        }
        ler.close();
    }
}
