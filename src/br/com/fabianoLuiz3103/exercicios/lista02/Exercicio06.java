package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba 3 números e mostre o maior e o menor
 */

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[3];
        double maior, menor;

        for(int i = 0; i < numeros.length; i++){

            while (true){

                try{
                    System.out.println("\nInforme o " + (i+1) + "º valor: ");
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\nO valor informado deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }

        maior = menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        System.out.printf("NÚMEROS: %.1f, %.1f, %.1f. MAIOR: %.1f - MENOR: %.1f", numeros[0], numeros[1], numeros[2], maior, menor);

        scanner.close();
    }
}
