package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que dado um conjunto de N números apresente o maior, menor e a soma deles
 */
public class Exercicio017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double maior, menor, soma = 0;
        Random random = new Random();

        for(int i = 0; i < numeros.length; i++){
            double numeroAleatorio = random.nextDouble()*1001;
            numeros[i] = Math.floor(numeroAleatorio*100)/100;
            soma = soma+numeros[i];
        }
        System.out.print("\n--------------------------------------------------------" +
                "\n\tNA SEQUÊNCIA: ");
        for (double n: numeros){System.out.print(n + ", ");};
        ordenarArray(numeros);
        maior = numeros[numeros.length-1];
        menor = numeros[0];
        System.out.println("\n\tO MAIOR NUMÉRO É: " + maior +
        "\n\tO MENOR NÚMERO É: " + menor +
                "\n\tA SOMA DE TODOS OS NÚMEROS É: " + soma);

        scanner.close();
    }

    private static void ordenarArray(double[] numeros){
        double aux;
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length-1; j++){
                if(numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }


}
