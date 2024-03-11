import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        
        
        System.out.printf("Digite o nome do titular: ");
        String nomeTitular = ler.nextLine();
        System.out.printf("Digite o número da conta: ");
        int numeroConta = ler.nextInt();
        System.out.printf("Digite o saldo: ");
        double saldo = ler.nextDouble();

        Conta c = new Conta(nomeTitular, saldo, numeroConta);

        ler.nextLine();

        while(true){
            System.out.printf("\n1- Depositar \n2- Sacar \nOutro para sair\nOpção:");
            int opcao = ler.nextInt();

            if(opcao == 1){
                System.out.printf("Quanto deseja depositar? ");
                double valorDeposito = ler.nextDouble();

                c.depositar(valorDeposito);
                System.out.printf("Saldo atualizado: R$ " + c.saldo);

            } else if(opcao == 2){
                System.out.printf("Quanto deseja sacar? ");
                double valorSaque = ler.nextDouble();

                boolean respostaSaque = c.sacar(valorSaque);

                if(respostaSaque == true){
                    System.out.printf("Saque feito com sucesso");
                    System.out.printf("Saldo atualizado: R$ " + c.saldo);
                } else {
                    System.out.printf("Saque não foi realizado pois não à saldo suficiente! ");
                }
            } else {
                System.out.printf("Obrigada, encerrado!");
                break;
            }
        }
        
    }
}