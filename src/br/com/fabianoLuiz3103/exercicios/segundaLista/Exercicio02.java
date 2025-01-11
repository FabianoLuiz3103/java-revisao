package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba um número e informe se ele é positivo ou negativo
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numeroInformado;

        while (true){
            try{
                System.out.println("\nDigite um número: ");
                 numeroInformado = scanner.nextDouble();
                 break;
            }catch (InputMismatchException e){
                System.out.println("O valor digitado deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }

        if(numeroInformado > 0){
            System.out.println("O Nº" + numeroInformado + " é positivo! ");
        } else if(numeroInformado < 0){
            System.out.println("O Nº" + numeroInformado + " negativo! ");
        } else {
            System.out.println("O Nº É ZERO!!" );
        }

        scanner.close();
    }
}
