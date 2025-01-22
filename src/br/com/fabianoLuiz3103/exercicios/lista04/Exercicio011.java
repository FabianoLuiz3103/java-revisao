package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe a idade de 10 pessoas e informa a quantidade
 * de pessoas com mais de 35 anos
 */
public class Exercicio011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        int quantidadeMaior35 = 0;

        for (int i = 0; i < idades.length; i++) {
            while (true) {
                try {
                    System.out.print("\n\tInforme a " + (i + 1) + "º idade: ");
                    idades[i] = scanner.nextInt();
                    if (idades[i] > 0) {
                        break;
                    }
                    System.out.println("\n\tERRO! O valor deve ser maior que zero!");
                } catch (InputMismatchException e) {
                    System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                    scanner.nextLine();
                }
            }
            if (idades[i] > 35) {
                quantidadeMaior35++;
            }
        }
        System.out.print("\n------------------------------------------------" +
                "\nDAS IDADES INFORMADAS: ");
        for (int idade : idades) {
            System.out.print(idade + ", ");
        }
        System.out.println(quantidadeMaior35 + " PESSOAS TEM MAIS DE 35 ANOS");

        scanner.close();
    }
}
