package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Programa que conta quantidade de valores pares em um vetor!
 */
public class Exercicio09 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int pares = 0, soma = 0;
        Random random = new Random();

        System.out.print("\n\n-----------------------------------------------" +
                "\nNO VETOR: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = sortearNumero(vetorA, i, random);
            System.out.print(vetorA[i] + ((i == vetorA.length-1) ? ". " : ", "));
            if(vetorA[i]%2==0){
                pares++;
            }
            soma+=vetorA[i];
        }

        System.out.println("\n------------------------------------------" +
                "\nA QUANTIDADE DE NÚMEROS PARES É: " + pares +
                "\nA SOMA DOS ELEMENTOS É: " + soma);
    }

    private static int sortearNumero(int[] vetor, int indiceAtualVetor, Random random){
        int numeroSorteado = 0;
        boolean repetido = true;

        while (repetido){
            numeroSorteado = random.nextInt(30)+1;
            repetido = false;
            for(int i = 0; i < indiceAtualVetor; i++){
                if(vetor[i]==numeroSorteado){
                    repetido = true;
                    break;
                }
            }
        }
        return numeroSorteado;
    }
}
