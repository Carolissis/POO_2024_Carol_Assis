//Criar um programa que simula o lançamento de um dado e imprime o resultado

import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(6);

        System.out.printf("número: " + (num +1));

        ler.close();
    }
}