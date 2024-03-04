//Criar um programa que pede ao usuário para digitar sua idade e imprime se ele é
//menor ou maior de idade

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;

        System.out.printf("Informe sua idade: ");
        idade = ler.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        ler.close();
    }
}