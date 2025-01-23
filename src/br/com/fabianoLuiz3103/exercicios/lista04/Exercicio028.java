package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Imprimir os elementos do vetor A e seus respectivos divisores
 */
public class Exercicio028 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        Random random = new Random();

        System.out.println("\n---------------------------------------" +
                "\nDIVISORES DE 1 até A[i]:\n");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(30)+1;
            System.out.print(vetorA[i] + " --> ");
            for(int j = 1; j <= Math.sqrt(vetorA[i]); j++){
                if(vetorA[i]%j==0){
                    System.out.print( j + ", ");
                    if(j != (vetorA[i]/j)){
                        System.out.print( (vetorA[i]/j) + ", ");
                    }
                }
            }
            System.out.println();
        }
    }
}
