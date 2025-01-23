package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 20 elementos inteiros
 * --> Vetor B com os pares de A e vetor C com os ímpares de A
 */
public class Exercicio023 {

    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];
        int indexB = 0, indexC = 0;
        Random random = new Random();

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1;
            if(vetorA[i]%2==0){
                vetorB[indexB] = vetorA[i];
                indexB++;
            }else {
                vetorC[indexC] = vetorA[i];
                indexC++;
            }
        }

        System.out.printf("%-10s  %-10s %-10s\n", "VETOR A", "VETOR B", "VETOR C");
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("%5d  %8d %10d\n", vetorA[i], vetorB[i], vetorC[i]);
        }

       
        
    }
}
