package br.com.fabianoLuiz3103.exercicios.lista04;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 10 elementos e vetor B com B[i] = A[i]*i
 */
public class Exercicio04 {

    public static void main(String[] args) {

        int[] vetorA = {12, 1, 2, 3, 36, 27, 14, 98, 21, 100};
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i]*i;
            System.out.println("A[" + i + "]: " + vetorA[i] + " -|- B[" + i + "]: " + vetorB[i]);
        }
    }
}
