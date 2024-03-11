import java.util.Random;

public class Conta {

    public String nomeTitular;
    public double saldo;
    public int numeroConta;

    public Conta(String nomeTitular, double saldo, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public boolean sacar(double valorSaque) {
        if(this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            return(true); 
        }
        else 
            return false;
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public double verSaldo() {
        return this.saldo;
    }
}