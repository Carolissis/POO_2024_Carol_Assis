// Exercício 3: Acesso a um Array
// Declare um array de inteiros com um tamanho fixo. Tente acessar um índice
// além do tamanho do array dentro de um bloco try. Utilize a cláusula catch para
// capturar a possível exceção de acesso indevido ao array
// (ArrayIndexOutOfBoundsException) e imprima uma mensagem explicando o
// erro.

import java.lang.*;

public class Main{
    public static void main(String[] args){

        int[] arrayInt = {1,2,3};

        try{
            int w = arrayInt[4];

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf("Erro: " + e.getMessage());
        }
    }
}