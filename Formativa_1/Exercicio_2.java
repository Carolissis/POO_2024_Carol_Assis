//Criar um programa que pede ao usuário para digitar um número e depois imprime se
//ele é positivo, negativo ou zero

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;

        System.out.printf("Informe um número: ");
        num = ler.nextInt();

        if(num > 0){
            System.out.println("O número é positivo.");
        }
        else if(num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        ler.close();
    }
}