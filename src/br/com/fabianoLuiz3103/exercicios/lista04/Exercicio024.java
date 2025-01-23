package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> 2 vetores A e B de mesmo tipo e tamanho
 * --> B vai ter os primeiros números pares de A e o resto os ímpares
 */
public class Exercicio024 {

    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        Random random = new Random();
        int indexB=0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1;
            if(vetorA[i]%2==0){
                vetorB[indexB]=vetorA[i];
                indexB++;
            }
        }

        for(int i =0; i < vetorA.length; i++){
            if(vetorA[i]%2!=0){
                vetorB[indexB]=vetorA[i];
                indexB++;
            }
        }

        System.out.printf("%-10s  %-10s\n", "VETOR A", "VETOR B");
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("%5d  %8d\n", vetorA[i], vetorB[i]);
        }
    }
}
