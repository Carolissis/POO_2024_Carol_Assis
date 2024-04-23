// Exercício 2: Conversão de String para Inteiro
// Crie um programa que peça ao usuário para inserir uma string representando um
// número inteiro. Utilize a cláusula try-catch para lidar com a possível exceção de
// conversão de string para inteiro (NumberFormatException) e imprima uma
// mensagem indicando que a entrada não é um número válido.

import java.util.Scanner;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.printf("Número: ");
            String numStr = sc.nextLine();

            int numInt = Integer.parseInt(numStr);

        } catch(NumberFormatException e){
            System.out.printf("Erro: " + e.getMessage());
        }
    }
}