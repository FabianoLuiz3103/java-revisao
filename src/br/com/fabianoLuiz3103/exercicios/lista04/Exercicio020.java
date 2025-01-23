package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> 2 vetores A do tipo int e B do tipo char
 * B[i] = 'a' -> A[i] < 7
 * B[i] = 'b' -> A[i] == 7
 * B[i] = 'c' -> A[i] > 7 && < 10
 * B[i] = 'd' -> A[i] == 10
 * B[i] = 'e' -> A[i] > 10
 */
public class Exercicio020 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];
        Random random = new Random();

        System.out.printf("%-10s  %-10s\n", "VETOR A", "VETOR B");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(12)+1;

            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            }else if(vetorA[i] == 7){
                vetorB[i] = 'b';
            }else if(vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            }else if(vetorA[i] == 10){
                vetorB[i] = 'd';
            }else{
                vetorB[i] = 'e';
            }

            System.out.printf("%5d  %8c\n", vetorA[i], vetorB[i]);
        }
    }
}
