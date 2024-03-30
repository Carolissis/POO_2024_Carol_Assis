//Criar um programa que calcula o fatorial de um número

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num, fatorial = 1;

        System.out.printf("Informe um número: ");
        num = ler.nextInt();

        for(int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.printf("Fatorial: " + fatorial);
        ler.close();
    }
}