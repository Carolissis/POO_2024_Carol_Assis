// Criar um programa que imprime os números de 1 a 100 e substitui os múltiplos de 3
//por "Fizz", os múltiplos de 5 por "Buzz" e os múltiplos de ambos por "FizzBuzz".

public class Exercicio_10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.printf("FizzBuzz, ");
            } else if(i%3 == 0){
                System.out.printf("Fizz, ");
            } else if(i%5 == 0){
                System.out.printf("Buzz, ");
            } else {
                System.out.printf(i +", ");
            }
        }
    }
}