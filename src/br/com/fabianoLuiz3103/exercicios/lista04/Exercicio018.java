package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> 2 vetores A e B; B[i] deverá receber 1 quando A[i] for par e 0 quando A[i]
 * for ímpar
 */
public class Exercicio018 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        Random random = new Random();

        System.out.printf("%-10s  %-10s\n", "VETOR A", "VETOR B");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1;
            vetorB[i]= vetorA[i]%2==0 ? 1 : 0;

            System.out.printf("%5d  %8d\n", vetorA[i], vetorB[i]);

        }

    }
}
