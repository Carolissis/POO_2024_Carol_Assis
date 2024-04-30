import java.io.Serializable;

public class Livro implements Serializable{
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private double preco;

    public Livro(int id, String titulo, String autor, String isbn, int paginas, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.preco = preco;
    }
    
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getPaginas() {
        return paginas;
    }
    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
