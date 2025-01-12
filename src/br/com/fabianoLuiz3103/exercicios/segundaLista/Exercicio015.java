package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe um ano e diz se é bissexto
 */
public class Exercicio015 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anoInformado;

        while (true){

            try{
                System.out.println("\n\tInforme um ano: ");
                anoInformado = scanner.nextInt();

                if (anoInformado < 0){
                    System.out.println("\n\tERRO! O ano deve ser maior que zero!");
                }else {

                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O ano informado deve ser um número inteiro!");
                scanner.nextLine();
            }
        }

        if((anoInformado % 4 == 0 && anoInformado % 100 != 0) ||
                (anoInformado % 100 == 0 && anoInformado % 400 == 0)){
            System.out.println("\n\tO ano: " + anoInformado + " é bissexto!");
        } else{
            System.out.println("\n\tO ano: " + anoInformado + " não é bissexto!");
        }
        scanner.close();
    }
}
