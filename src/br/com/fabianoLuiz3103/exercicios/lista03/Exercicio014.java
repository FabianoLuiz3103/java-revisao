package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que gera a sequência de fibonacci até o número informado
 */

public class Exercicio014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado = 0;

        while (true) {
            try {
                System.out.println("\n\tInforme um número limite para a sequência de Fibonacci: ");
                numeroInformado = scanner.nextInt();
                if (numeroInformado < 2) {
                    System.out.println("O número deve ser maior ou igual a 2 para formar uma sequência válida.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n\tERRO! O valor deve ser um número inteiro!");
                scanner.nextLine();
            }
        }

        int[] numeros = new int[numeroInformado];
        int a = 0, b = 1, fibonacci;

        numeros[0] = a;
        numeros[1] = b;

        for (int i = 2; i < numeroInformado; i++) {
            fibonacci = a + b;
            numeros[i] = fibonacci;
            a = b;
            b = fibonacci;
        }

        for (int n : numeros) {
            System.out.print(n + " ");
        }
        scanner.close();
    }
}
