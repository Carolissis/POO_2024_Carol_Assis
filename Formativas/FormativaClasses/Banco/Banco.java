import java.util.Scanner;

public class Banco{
    private int numeroConta;
    private double saldo;

    public Banco(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar(double valorSacar){
        if(this.saldo >= valorSacar){
            this.saldo -= valorSacar;
        }else{
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}