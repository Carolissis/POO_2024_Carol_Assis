import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<String[]> lerArquivoCSV(String caminhoArquivo) {
        List<String[]> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                linhas.add(campos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }
}
