import java.util.Scanner;

public class Livro{
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.printf("Título: " + this.titulo + "\nAutor: " + this.autor + "\nPaginas: " + this.paginas);
    }
}