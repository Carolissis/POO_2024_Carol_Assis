import java.util.*;

public class Jogo {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        String[] jogadores = new String[5];
        int[] pontuacoes = new int[5];
        int[] moedas = new int[5];
        int qnt = 0;

        while(true) {
            System.out.println("1) Adicionar um novo jogador com seu nome, pontuação inicial e as quantidades (max 5)");
            System.out.println("2) Atualizar a pontuação de um jogador após a conclusão de um nível");
            System.out.println("3) Mostrar a pontuação total de um jogador");
            System.out.println("4) Mostrar o total de moedas coletadas em um determinado nível por todos os jogadores");
            System.out.println("5) Mostrar o jogador com a pontuação mais alta");
            System.out.println("6) Sair");
            System.out.printf("Opção:");
            int opcao = ler.nextInt();
            ler.nextLine(); 

            if(opcao == 6) {
                break;
            } else {

                switch(opcao){
                    case 1:
                        if(qnt >= 5){
                            System.out.printf("Não é mais possivel adicionar jogadores");
                        } else {
    
                            System.out.printf("Nome do jogador: ");
                            String jogador = ler.nextLine();
                            System.out.printf("Pontuação: ");
                            int pontos = ler.nextInt();
                            System.out.printf("Quantidade de moedas: ");
                            int moeda = ler.nextInt();
        
                            jogadores[qnt] = jogador;
                            pontuacoes[qnt] = pontos;
                            moedas[qnt] = moeda;
        
                            qnt += 1;
                        }
                        break;
                    case 2:
                        System.out.printf("Nome do jogador que deseja atualizar a pontuação: ");
                        String jogador = ler.nextLine();

                        int indice = Arrays.asList(jogadores).indexOf(jogador); 

                        if (indice != -1) {
                            System.out.println("Quantos pontos? ");
                            int pontos = ler.nextInt();
                            pontuacoes[indice] += pontos;
                            System.out.println(jogadores[indice] + " agora tem " + pontuacoes[indice+ " pontos");

                        } else {
                            System.out.println("O nome " + jogador + " não foi encontrado no jogo.");
                        }
                        
                        break;
                    case 3:
                        System.out.printf("Nome do jogador que deseja saber a pontuação: ");
                        String jogador = ler.nextLine();
    
                        int indice = Arrays.asList(jogadores).indexOf(jogador); 
    
                        if (indice != -1) {
                            System.out.println(jogador + " tem " + pontuacoes[indice] + " pontos");
                        } else {
                            System.out.println("O nome " + jogador + " não foi encontrado no jogo.");
                        }
                        break;
                    case 4:
                    case 5:
                        int maior = 0;
                        int index = -1;
                        for(int i = 0; i <= qnt; i++) {
                            if(pontuacoes[i] > maior){
                                maior = pontuacoes[i];
                                index = i;
                            }
                        }
                        System.out.println(jogadores[index] + " tem a maior pontuação");
                        break;
    
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }

        }
    }
}
