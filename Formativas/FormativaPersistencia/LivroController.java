import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LivroController {
    private List<Livro> livros;

    public LivroController() {
        try {
            livros = LivroDAO.ler(); 
        } catch (IOException | ClassNotFoundException e) {
            livros = new ArrayList<>();
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        salvarDados();  
    }

    public void removerLivro(int id) {
        livros.removeIf(l -> l.getId() == id);
        salvarDados();  
    }

    public List<Livro> buscarPorAutor(String autor) {
        return livros.stream()
                     .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                     .collect(Collectors.toList());
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    private void salvarDados() {
        try {
            LivroDAO.gravar(livros);  
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}