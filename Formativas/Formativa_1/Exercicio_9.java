//Criar um programa que verifica se um número é primo ou não.

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio_9 {
    public static void main(String[] args) {

        int num;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        num = ler.nextInt();

        boolean ehPrimo = Primo(num); 

        if(ehPrimo == true){
            System.out.printf("É primo");
        } else {
            System.out.printf("Não é primo");
        }
        
        ler.close();
        
    }

    public static boolean Primo(int num){
        Integer[] meuArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for(int primo : meuArray) {
            if(primo == num){
                return true;
            }
        }
        return false;
    }
}
