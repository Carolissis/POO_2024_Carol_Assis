// 1. Defina uma classe abstrata Conta com métodos abstratos para depósito,
// saque e verificar saldo.
// 2. Crie subclasses para diferentes tipos de contas bancárias, como
// ContaCorrente e ContaPoupanca, e implemente os métodos abstratos.
// 3. Teste as subclasses realizando operações de depósito, saque e
// verificação de saldo.

public class Main{
    public static void main(String[] args){
        ContaCorrente corrente = new ContaCorrente(600.00);
        ContaPoupanca poupanca = new ContaPoupanca(200.00);
        
        System.out.println("Conta corrente saldo: R$" + corrente.getSaldo() + "\nSacando R$200.00, saldo atual: R$" + corrente.sacar(200.00));
        System.out.println("Conta poupanca saldo: R$" + poupanca.getSaldo() + "\nDepositando R$200.00, saldo atual: R$" + poupanca.depositar(200.00));
    }
}

abstract class Conta{
    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract double sacar(double valorSaque);
    public abstract double depositar(double valorDeposito);
}
class ContaCorrente extends Conta{
    public ContaCorrente(double saldo){
        super(saldo);
    }
    public double sacar(double valorSaque){
        if(valorSaque > getSaldo()){
            System.out.println("Saque inválido!");
            return getSaldo();
        }
        else{
            setSaldo(getSaldo() - valorSaque);
            return getSaldo();            
        }
    }
    public double depositar(double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
        return getSaldo();
    }
}
class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo){
        super(saldo);
    }
    public double sacar(double valorSaque){
        if(valorSaque > getSaldo()){
            System.out.println("Saque inválido!");
            return getSaldo();
        }
        else{
            setSaldo(getSaldo() - valorSaque);
            return getSaldo();            
        }
    }
    public double depositar(double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
        return getSaldo();
    }
}