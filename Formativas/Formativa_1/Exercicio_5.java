//Criar um programa que converte uma temperatura em Celsius para Fahrenheit

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.printf("Informe a temperatura em Celsius: ");
        celsius = ler.nextInt();

        fahrenheit = (((9.0/5) * celsius)+ 32.0);

        System.out.printf("A temperatura em fahrenheit é " + fahrenheit);
        ler.close();
    }
}