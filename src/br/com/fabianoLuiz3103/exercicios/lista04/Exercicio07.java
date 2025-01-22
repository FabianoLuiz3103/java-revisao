package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor A e B com 10 elementos e vetor C[i]=A[i]*B[-]
 */
public class Exercicio07 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];
        Random random = new Random();

        System.out.println("\n\n-----------------------------------------------");
        for(int i = 0; i < vetorA.length; i++){

            vetorA[i] = random.nextInt(20,50)+1;
            vetorB[i] = random.nextInt(10,55)+1;
            vetorC[i] = vetorA[i]*vetorB[i];

            System.out.print(
                    "\nA["+i+"]: " + vetorA[i] + " * B["+i+"]: " + vetorB[i] + " = C["+i+"]: " + vetorC[i]);
        }
    }
}
