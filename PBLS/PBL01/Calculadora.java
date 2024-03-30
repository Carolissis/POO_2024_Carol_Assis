import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Logica logica = new Logica();
        Scanner ler = new Scanner(System.in);

        Double x, y;
        Double result = 0.0;
        String operacao, resposta;

        while(true) {

            System.out.printf("Deseja encerrar? Tecle 'P': ");
            resposta = ler.nextLine();

            if(resposta.equals("P")) {
                System.out.println("Calculadora encerrada ");
                break;
            } else {

                System.out.printf("Informe o 1º número: ");
                x = ler.nextDouble();
                ler.nextLine();
                System.out.printf("Informe o 2º número: ");
                y = ler.nextDouble();
                ler.nextLine();
                System.out.printf("Informe o operador: ");
                operacao = ler.nextLine();

                if(operacao.equals("+")) {
                    result = logica.Soma(x, y);
                } else if(operacao.equals("-")) {
                    result = logica.Subtracao(x ,y);
                } else if(operacao.equals("x") || operacao.equals("X") || operacao.equals("*")) {
                    result = logica.Multiplicacao(x, y);
                } else if(operacao.equals("/")) {
                    result = logica.Divisao(x, y);
                } else {
                    System.out.println("Operador não identificado"); 
                }
                System.out.println("Resultado: " + result);
            }
        }


    }
}