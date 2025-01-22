package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Receber um número menor que 1000 e mostrar a quantidade de centenas, dezenas e unidades.
 */
public class Exercicio017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado,
                centenas = 0,
                dezenas = 0,
                unidades = 0;

        while (true){

            try{
                System.out.println("\n\tInforme um número inteiro: ");
                numeroInformado = scanner.nextInt();
                if(numeroInformado > 0 && numeroInformado <= 1000){break;}
                System.out.println("\n\tERRO! O número deve estar entre 0 e 1000! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor informado deve ser um NÚMERO INTEIRO! ");
                scanner.nextLine();
            }
        }

        centenas = numeroInformado / 100;
        dezenas = (numeroInformado % 100) / 10;
        unidades = numeroInformado % 10;

        System.out.println("\n-----------------------------------------------------------" +
                "\nO NÚMERO " + numeroInformado + " TEM:" +
                "\n " + centenas + ((centenas<=1)?" Centena " : " Centenas ") +
                ", " + dezenas + ((dezenas<=1)?" Dezena " : " Dezenas ") +
                "e " + unidades + ((unidades<=1)?" Unidade " : " Unidades ")
        );

        scanner.close();
    }
}
