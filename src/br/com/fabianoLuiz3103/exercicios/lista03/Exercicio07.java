package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que vai receber 5 números e retornar o maior
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        for(int i = 0; i < numeros.length; i++){
            while (true){
                try {
                    System.out.println("\n\tInforme o " + (i+1) + "º número: ");
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }

        System.out.print("\n\t- O maior número da sequência: ");
        for(double n: numeros){
            System.out.print(n + ", ");
        }
        System.out.print(" é: " + ordenarArray(numeros)[numeros.length-1]);

        scanner.close();
    }

    private static double[] ordenarArray(double[] numeros){
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
        return numeros;
    }
}
