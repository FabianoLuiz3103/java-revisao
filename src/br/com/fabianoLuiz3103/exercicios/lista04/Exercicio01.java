package br.com.fabianoLuiz3103.exercicios.lista04;

/**
 * @author FabianoLuiz3103
 * --> Criar um vetor A com 5 elementos e construir um vetor B com os mesmos
 * elementos de A mas ao dobro
 * B[i] = A[i]*2
 */
public class Exercicio01 {

    public static void main(String[] args) {

        int[] vetorA = {10, 15, 20, 25, 50};
        int[] vetorB = new int[vetorA.length];

        System.out.print("\n-------------------------------------------" +
                "\nB[i] == A[i]*2\n");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i]*2;
            System.out.println("A[" + i + "]: " + vetorA[i] + " -|- B[" + i + "]: " + vetorB[i]);
        }

    }
}
