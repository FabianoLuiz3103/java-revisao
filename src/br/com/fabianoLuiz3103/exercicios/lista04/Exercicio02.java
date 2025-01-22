package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 15 elementos; vetor B com 15 elementos e B[i] = A[i]^2
 */

public class Exercicio02 {

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            int numero;
            boolean duplicado;
            do {
                numero = random.nextInt(30) + 1;
                duplicado = false;
                for (int j = 0; j < i; j++) {
                    if (vetorA[j] == numero) {
                        duplicado = true;
                        break;
                    }
                }
            } while (duplicado);

            vetorA[i] = numero;
            vetorB[i] = numero * numero;
            System.out.println("A[" + i + "]: " + vetorA[i] + " -|- B[" + i + "]: " + vetorB[i]);
        }
    }
}
