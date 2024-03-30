public class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void addAumento(double valor){
        this.salario += valor;
    }
    public double ganhoAnual(){
        return salario * 12;
    }
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + this.salario);
    }
}