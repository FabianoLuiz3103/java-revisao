package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça dois números e imprima o maior deles
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[2];

        for(int i = 0; i < numeros.length; i++){
            while (true){
                try{
                    System.out.println("Informe o " + (i+1) + "º número: ");
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("O número deve ser um valor do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }
        if(numeros[0] > numeros[1]){
            System.out.println("\n " + numeros[0] + " é maior que " + numeros[1]);
        } else {
            System.out.println("\n " + numeros[1] + " é maior que " + numeros[0]);
        }

        scanner.close();
    }
}
