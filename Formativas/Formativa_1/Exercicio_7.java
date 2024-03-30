//Criar um programa que simula o jogo pedra, papel e tesoura

import java.util.Random;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Random random = new Random();
        String[] meuArray = {"Pedra", "Papel", "Tesoura"};

        int indice1 = random.nextInt(meuArray.length);
        String p1 = meuArray[indice1];
        System.out.println("Pessoa 1: " + p1);

        int indice2 = random.nextInt(meuArray.length);
        String p2 = meuArray[indice2];
        System.out.println("Pessoa 2: " + p2);
        
        if(p1 == "Pedra" && p2 == "Papel") {
            System.out.println("Pessoa 2 ganhou!!");
        } else if(p1 == "Pedra" && p2 == "Tesoura") {
            System.out.println("Pessoa 1 ganhou!!");
        } else if(p1 == "Papel" && p2 == "Pedra") {
            System.out.println("Pessoa 1 ganhou!!");
        } else if(p1 == "Papel" && p2 == "Tesoura") {
            System.out.println("Pessoa 2 ganhou!!");
        } else if(p1 == "Tesoura" && p2 == "Pedra") {
            System.out.println("Pessoa 2 ganhou!!");
        } else if(p1 == "Tesoura" && p2 == "Papel") {
            System.out.println("Pessoa 1 ganhou!!");
        } else {
            System.out.println("Empate!");
        }
    }
}