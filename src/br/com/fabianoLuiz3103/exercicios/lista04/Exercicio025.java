package br.com.fabianoLuiz3103.exercicios.lista04;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 10 elementos inteiros -> Imprimir rabuada de cada elemento do vetor
 */
public class Exercicio025 {

    public static void main(String[] args) {

        int[] vetorA = {12, 13, 5, 6, 7, 8, 15, 21, 22, 10};

        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("%2d x %2d = %3d   ", vetorA[i], j, vetorA[i] * j);
            }
            System.out.println();
        }
    }
}
