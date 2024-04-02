public class Funcionario{
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public double calcularAumento(double porcentagem){
        double aumento = this.salario * (porcentagem / 100);
        this.salario += porcentagem;
        return this.salario;
    }
}