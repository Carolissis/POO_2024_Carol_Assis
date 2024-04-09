import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ManipularLista{
    public String manipularLista(List<Integer> lista, int x){
        lista.add(x); 

        StringBuilder resultado = new StringBuilder();

        for(int num : lista){
            resultado.append(num).append(", ");
        }
        return resultado.toString().trim();
    }
    public String manipularLista(List<Double> lista, double x){
        lista.remove(x); 

        StringBuilder resultado = new StringBuilder();

        for(Double num : lista){
            resultado.append(num).append(", ");
        }
        return resultado.toString().trim();
    }
    public int manipularLista(List<Integer> lista, String sinal){
        int resp = 0;
        if(sinal.equals("+")){
            resp = Collections.max(lista);

        } else if(sinal.equals("-")){
            resp = Collections.min(lista);

        } else{
            System.out.println("erro");
        }
        return resp;
    }
    public int manipularLista(List<Integer> lista){
        int total = 0;
        int i = 0;
        for(int num : lista){
            total += num;
            i++;
        }
        return total / i;

    }
    public static void main(String[] args){

        ManipularLista manip = new ManipularLista();

        List<Integer> listaInteiros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Double> listaDoubles = new ArrayList<>(List.of(1.5, 2.5, 3.5, 4.5, 5.5));


        System.out.println("Adicionar int: " + manip.manipularLista(listaInteiros, 6));
        System.out.println("Remover double: " + manip.manipularLista(listaDoubles, 3.5));
        System.out.println("Maximo int: " + manip.manipularLista(listaInteiros, "+"));
        System.out.println("Minimo int: " + manip.manipularLista(listaInteiros, "-"));
        System.out.println("Média int: " + manip.manipularLista(listaInteiros));
    }
}