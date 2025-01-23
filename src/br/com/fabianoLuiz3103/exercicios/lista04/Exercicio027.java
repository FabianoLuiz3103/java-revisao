package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor com 10 elementos e os números pares de 0 até o respectivo elemento
 */
public class Exercicio027 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        Random random = new Random();

        System.out.println("\n---------------------------------------" +
                "\nPARES DE 0 até A[i]:\n");
        for(int i =0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(20)+1;
            System.out.print(vetorA[i] + " --> ");
            for(int j = 0; j <= vetorA[i]; j++){
                if(j%2==0){
                    System.out.print( j + ", ");
                }
            }
            System.out.println();
        }
    }
}
