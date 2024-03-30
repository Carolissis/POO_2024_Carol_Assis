public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
    }
}