package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> O programa vai receber 10 números e retornar a quantidade de pares e ímpares
 */
public class Exercicio013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        for(int i = 0; i < numeros.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme o " + (i+1) + "º número:");
                    numeros[i] = scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("\n-----------------------------------------------------------" +
                "\nENTRE OS NÚMEROS: ");
        for(int n:numeros){
            if(n%2==0) {
                pares++;
            }
            System.out.print(n + ", ");
        }
        System.out.println("EXISTEM " + pares + " NÚMEROS PARES E " + (numeros.length-pares) + " NÚMEROS ÍMPARES! ");

        scanner.close();
    }
}
