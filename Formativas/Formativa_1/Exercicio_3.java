//Criar um programa que calcula a média de três números digitados pelo usuário

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> listaNum = new ArrayList<>();
        int num, total = 0;
        double media;

        for(int i = 1; i <= 3; i++){
            
            System.out.print(i + "º número: ");
            num = ler.nextInt();
            listaNum.add(num);
        }
        
        for(int i : listaNum){
            total += i;
        }

        media = (double) total / listaNum.size();

        System.out.print("A média é " + media);

        ler.close();

    }
}