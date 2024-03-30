import java.util.ArrayList;inteli

public class Estudante{
    private String nome;
    private int matricula;
    private ArrayList<Double> notas;

    public Estudante(String nome, int matricula, ArrayList<Double> notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    public double calcularMedia(){
        double total = 0;
        for(double nota: this.notas){
            total += nota;
        }
        return total / this.notas.size();
    }
}