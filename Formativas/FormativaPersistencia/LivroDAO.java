import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private static final String caminho = "biblioteca.dat";  

    public static void gravar(List<Livro> livros) throws IOException {
        FileOutputStream outFile = new FileOutputStream(caminho);
        ObjectOutputStream outStream = new ObjectOutputStream(outFile);
        outStream.writeObject(livros);  
        outStream.close();
    }

    public static List<Livro> ler() throws IOException, ClassNotFoundException {
        File file = new File(caminho);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        FileInputStream inFile = new FileInputStream(file);
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        List<Livro> livros = (List<Livro>) inStream.readObject();  
        inStream.close();
        return livros;
    }
}
