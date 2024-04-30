import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int opcao = 4;
        if(opcao == 1){ // Leitura de um único registro
            Formiga f = (Formiga) Serializador.ler("uma_fumiga.dat");
            System.out.println(f.getNome());
        }else if(opcao == 2){ // Gravação de um único registro
            try{
                Formiga f = new Formiga();
                f.setNome("Pequenina");
                f.setRainha(true);
                // Método foi definido como estático, pode-se chamar o método sem precisar instanciar a classe.
                Serializador.gravar("uma_fumiga.dat",f);
            }catch(IOException e){
                System.out.print(e.getMessage());
            }
        }else if(opcao == 3){ // Grava uma lista de Formigas
            ArrayList<Formiga> formigueiro = new ArrayList<>();
            for(int i=0;i<10;i++){
                Formiga f = new Formiga();
                f.setNome("Fumiga_"+i);
                formigueiro.add(f);
            }
            Serializador.gravar("formigueiro.dat",formigueiro);
        }else if(opcao == 4){ // Lê uma lista de Formigas
            ArrayList<Formiga> formigueiro;
            formigueiro = (ArrayList<Formiga>) Serializador.ler("formigueiro.dat");
            for(Formiga f: formigueiro){
                System.out.println(f.getNome());
            }
        }else if(opcao == 5){ // Lê um arquivo CSV
            String caminhoArquivo = "arquivo.csv";
            List<String[]> linhas = CSVReader.lerArquivoCSV(caminhoArquivo);

            // Exemplo de uso: Iterar sobre as linhas e imprimir os campos
            for (String[] linha : linhas) {
                for (String campo : linha) {
                    System.out.print(campo + " ");
                }
                System.out.println();
            }
        }
    }
}