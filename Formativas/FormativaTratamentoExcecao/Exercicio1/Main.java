// Exercício 1: Divisão por Zero
// Crie um programa que solicite dois números ao usuário e realize a divisão do
// primeiro pelo segundo. Utilize a cláusula try-catch para lidar com a possível
// divisão por zero.

import java.util.Scanner;
import java.lang.RuntimeException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.printf("1º num: ");
            int x = sc.nextInt();
            System.out.printf("2º num: ");
            int y = sc.nextInt();

            int z = x / y;
            System.out.printf("Resultado: " + z);
        } catch(ArithmeticException e){
            System.out.printf("Erro: " + e.getMessage());
        }
    }
}