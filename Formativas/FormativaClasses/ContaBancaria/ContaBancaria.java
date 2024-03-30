import java.util.Scanner;

public class ContaBancaria{
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar(double valorSacar){
        if(this.saldo >= valorSacar){
            this.saldo -= valorSacar;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void exibirSaldo(){
        System.out.printf("Saldo: %.2f\n ", getSaldo());
    }
}