import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;

        System.out.printf("Informe um número: ");
        num = ler.nextInt();

        if((num%2) == 0){
            System.out.println("O número é par.");
        }
        else {
            System.out.println("O número é impar.");
        }
    }
}