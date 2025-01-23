package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * Vetor A e B de mesmo tamanho
 * B[i] = A[i]!;
 */
public class Exercicio030 {

    public static void main(String[] args) {

        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        long[] vetorB = new long[vetorA.length];
        long fatorial = 1;

        for(int i = 0; i < vetorA.length; i++){
            fatorial =1;
            for(int j = vetorA[i]; j > 0; j--){
                fatorial*=j;
                vetorB[i] = fatorial;
            }
            System.out.println(vetorA[i] + "!: " + vetorB[i]);
        }


    }
}
