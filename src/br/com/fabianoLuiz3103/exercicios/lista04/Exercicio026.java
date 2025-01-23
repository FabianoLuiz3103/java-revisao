package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Programa que verifica se cada número do vetor é primo ou não
 */
public class Exercicio026 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(30)+1;
            System.out.println(numeros[i] + ((isPrimo(numeros[i])?" - É PRIMO! " : " - NÃO É PRIMO!")));
        }
    }

    private static boolean isPrimo(int numero){
        if(numero < 2){return false;}
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i ==0){
                return false;
            }
        }
        return true;
    }
}
