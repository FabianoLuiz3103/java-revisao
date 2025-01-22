package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor com 10 posições preenchido aleatóriamente com 0 e 1
 * --> Retornar a porcentagem de 0 e 1
 */
public class Exercicio015 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int quantidadeZero = 0;
        double porcZero;

        System.out.print("\n\n-------------------------------------------" +
                "\nNO VETOR: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random());
            System.out.print(vetorA[i] + ((i==9)?". " : ","));
            if(vetorA[i]==0){
                quantidadeZero++;
            }
        }
        porcZero = quantidadeZero/(vetorA.length/(double)100);
        System.out.println("\n(0) REPRESENTA " + porcZero + "%" +
                "\n(1) REPRESENTA " + (100-porcZero) + "%");
    }
}
