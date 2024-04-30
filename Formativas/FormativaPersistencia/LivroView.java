import java.util.List;
import java.util.Scanner;

public class LivroView {
    private static LivroController controller = new LivroController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nBem-vindo ao Catálogo de Livros");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Excluir Livro por ID");
            System.out.println("3. Buscar Livro por Autor");
            System.out.println("4. Listar Todos os Livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();  
            switch (option) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    excluirLivro();
                    break;
                case 3:
                    buscarPorAutor();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarLivro() {
        System.out.print("Digite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();
        System.out.print("Digite o número de páginas: ");
        int paginas = scanner.nextInt();
        System.out.print("Digite o preço do livro: ");
        double preco = scanner.nextDouble();

        Livro livro = new Livro(id, titulo, autor, isbn, paginas, preco);
        controller.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void excluirLivro() {
        System.out.print("Digite o ID do livro a ser excluído: ");
        int id = scanner.nextInt();
        controller.removerLivro(id);
        System.out.println("Livro excluído com sucesso!");
    }

    private static void buscarPorAutor() {
        System.out.print("Digite o autor para busca: ");
        String autor = scanner.nextLine();
        List<Livro> livros = controller.buscarPorAutor(autor);
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado para este autor.");
        } else {
            for (Livro livro : livros) {
                imprimirLivro(livro);
            }
        }
    }

    private static void listarLivros() {
        List<Livro> livros = controller.getLivros();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado no sistema.");
        } else {
            for (Livro livro : livros) {
                imprimirLivro(livro);
            }
        }
    }

    private static void imprimirLivro(Livro livro) {
        System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + 
                           ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getIsbn() + 
                           ", Páginas: " + livro.getPaginas() + ", Preço: R$" + livro.getPreco());
    }
}
