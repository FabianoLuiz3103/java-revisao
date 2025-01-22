package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que vai receber 5 números e retornar a soma com a média
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0, media;

        for (int i = 0; i < numeros.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme o " + (i+1) + "º número: " );
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
            soma += numeros[i];
        }
        media = soma/numeros.length;
        System.out.print("\n------------------------------------------------------" +
                "\n\tA SEQUÊNCIA: ");
        for(double n: numeros){
            System.out.print(n + ", ");
        }
        System.out.print("TEM SOMA IGUAL A: " + soma + " E MÉDIA IGUAL A: " + media);

        scanner.close();
    }
}
