package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> 3 vetores A, B e C do mesmo tipo e tamanho
 * C[i] = 1 -> A[i] > B[i]
 * C[i] = 0 -> A[i] == B[i]
 * C[i] = -1 -> A[i] < B[i]
 */
public class Exercicio019 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];
        Random random = new Random();

        System.out.printf("%-10s  %-10s %-10s\n", "VETOR A", "VETOR B", "VETOR C");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1; //[1,30]
            vetorB[i] = random.nextInt(30); //[0,29]
            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }else if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }else{
                vetorC[i] = -1;
            }

            System.out.printf("%5d  %8d %10d\n", vetorA[i], vetorB[i], vetorC[i]);
        }
    }
}
