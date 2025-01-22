package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe um número e informa se ele é inteiro ou decimal
 */
public class Exercicio019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numeroInformado, numeroArredondado;

        do{
            try{
                System.out.println("\n\tInforme um número: ");
                numeroInformado = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor informado deve ser um número! ");
                scanner.nextLine();
            }
        }while (true);

        //é uma opção de resolução!
//        numeroArredondado = Math.ceil(numeroInformado);
//        if(numeroInformado == numeroArredondado){


        if(numeroInformado == (int) numeroInformado){
            System.out.println("\n\tO NÚMERO " + numeroInformado + " É UM NÚMERO INTEIRO! ");
        }else {
            System.out.println("\n\tO NÚMERO " + numeroInformado + " É UM NÚMERO DECIMAL! ");
        }

        scanner.close();
    }
}
