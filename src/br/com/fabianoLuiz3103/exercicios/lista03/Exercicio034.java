package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que lê uma quantidade indeterminada de números e encerra quando for negativo
 */
public class Exercicio034 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado=0, i = 1;
        int primeiroIntervalo = 0, // [0-25]
                segundoIntervalo = 0, // [26-50]
                terceiroIntervalo = 0, // [51 - 75]
                quartoIntervado = 0; // [76 - 100]

        while (numeroInformado>=0){

                try{
                    System.out.println("\n\tInforme o " + i + "º número: ");
                    numeroInformado = scanner.nextInt();

                    if(numeroInformado >= 0 && numeroInformado <= 25){
                        primeiroIntervalo++;
                    }else if(numeroInformado >= 26 && numeroInformado <= 50){
                        segundoIntervalo++;
                    }else if(numeroInformado >= 51 && numeroInformado <= 75){
                        terceiroIntervalo++;
                    }else if(numeroInformado >= 76 && numeroInformado <= 100){
                        quartoIntervado++;
                    }
                    i++;

                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor informado deve ser um número inteiro! ");
                    scanner.nextLine();
                }
        }
        System.out.println("\n--------------------------------------------------" +
                "\n[0-25] - " + primeiroIntervalo +
                        "\n[26-50] - " + segundoIntervalo +
                        "\n[51-75] - " + terceiroIntervalo +
                        "\n[76-100] - " + quartoIntervado
                );

        scanner.close();
    }
}
