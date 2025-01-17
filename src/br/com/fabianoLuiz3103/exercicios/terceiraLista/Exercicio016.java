package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Calcular fatorial de um número informado pelo usuário
 */
public class Exercicio016 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado, fatorial=1;

        while (true){
            try{
                System.out.print("\n\tInforme um número inteiro: ");
                numeroInformado = scanner.nextInt();
                if(numeroInformado>=0){break;}
                System.out.print("\n\tERRO! O número deve ser maior ou igual a zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro!!");
                scanner.nextLine();
            }
        }
        for(int i = numeroInformado; i > 0; i--){
            fatorial = fatorial * i;
        }
        System.out.print("\n---------------------------------------------------" +
                "\n\tO FATORIAL DE " + numeroInformado + " É: " + fatorial);
    }
}
