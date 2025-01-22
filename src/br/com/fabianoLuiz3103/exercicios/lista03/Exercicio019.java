package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que diz se o número é primo ou não
 */
public class Exercicio019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado, qtdDivisores=0;

        while (true){
            try{
                System.out.println("\n\tInforme um número: ");
                numeroInformado = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor dever ser um número inteiro!");
                scanner.nextLine();
            }
        }

        if(numeroInformado>0){
            for(int i = numeroInformado; i > 0; i--){
                if(numeroInformado%i==0){
                    qtdDivisores++;
                }
            }
            if(qtdDivisores == 2){
                System.out.println("\n----------------------------" +
                        "\n" + numeroInformado + " É PRIMO!");
            } else{
                System.out.println("\n----------------------------" +
                        "\n" + numeroInformado + " NÃO É PRIMO! E É DIVISÍVEL POR: ");
                for(int i = numeroInformado; i > 0; i--){
                    if(numeroInformado%i==0){
                        System.out.println(i);
                    }
                }
            }
        }else{
            System.out.println("\n\tNÃO EXISTE NÚMERO PRIMO MENOR QUE 1!");
        }

        scanner.close();
    }
}
