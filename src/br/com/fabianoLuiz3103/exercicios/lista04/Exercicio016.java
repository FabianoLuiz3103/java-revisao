package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Programa que verifica se todos os números de um vetor são pares
 * se pelo menos um não for par o programa encerra
 */
public class Exercicio016 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[10];

        for(int i=0; i< numeros.length; i++){
            numeros[i] = random.nextInt(30)+1;
            System.out.print(numeros[i] + ((i==9)?". " : ", "));
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]%2!=0){
                System.out.println("\n1º Número ímpar encontrado no vetor é: " + numeros[i] + " está na posição: " + i);
                break;
            }
        }

    }
}
