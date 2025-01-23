package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> 2 vetores A e B do mesmo tipo e tamanho;
 * --> Vetor C que é o dobro de A/B -> C[0-10] = A[i] | C[11-19] = B[i]
 */
public class Exercicio022 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length*2];
        Random random = new Random();

        System.out.printf("%-10s  %-10s\n", "VETOR A", "VETOR B");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1;
            vetorB[i] = random.nextInt(20)+1;
            vetorC[i] = vetorA[i];
            vetorC[vetorB.length+i] = vetorB[i];

            System.out.printf("%5d  %8d\n", vetorA[i], vetorB[i]);
        }

        System.out.print("\nVETOR C: ");
        for(int c: vetorC){
            System.out.print(c + ", ");
        }
    }
}
