import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        
        while(true){
            System.out.printf("\n1- Criar conta\n2- Ver saldo\n3- Depositar \n4- Sacar \nOutro para sair\nOpção:");
            int opcao = ler.nextInt();
            ler.nextLine();

            if(opcao == 1){
                System.out.println("Digite o nome do titular: ");
                String nomeTitular = ler.nextLine();
                System.out.println("Digite o saldo: ");
                double saldo = ler.nextDouble();

                Conta c = new Conta(nomeTitular, saldo);
                contas.add(c);

                System.out.printf("Conta criada com sucesso!\nNome: " + c.nomeTitular + "\nSaldo: R$" + c.saldo + "\nNúmero da conta: " + c.numeroConta);
            } else if(opcao >= 2 && opcao <= 4){
                System.out.print("Digite o número da conta: ");
                int numeroConta = ler.nextInt();
                Conta conta = contas.stream()
                                    .filter(c -> c.numeroConta == numeroConta)
                                    .findFirst()
                                    .orElse(null);
                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                    continue;
                }

                switch (opcao) {
                    case 2: // Ver saldo
                        System.out.printf("Saldo atual: R$%.2f\n", conta.verSaldo());
                        break;
                    case 3: // Depositar
                        System.out.print("Quanto deseja depositar? ");
                        double valorDeposito = ler.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.printf("Depósito realizado. Saldo atualizado: R$%.2f\n", conta.verSaldo());
                        break;
                    case 4: // Sacar
                        System.out.print("Quanto deseja sacar? ");
                        double valorSaque = ler.nextDouble();
                        if (conta.sacar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso.");
                            System.out.printf("Saldo atualizado: R$%.2f\n", conta.verSaldo());
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    }
                } else {
                    System.out.printf("Obrigada, sistema encerrado!");
                    break;
                }
        }
    }
}