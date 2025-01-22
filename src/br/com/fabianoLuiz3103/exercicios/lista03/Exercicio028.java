package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Fatorial de um número 2 - exibição diferente
 */
public class Exercicio028 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado, fatorial = 1;

        while (true){
            try{
                System.out.println("\n\tInforme um número:");
                numeroInformado = scanner.nextInt();
                if(numeroInformado >= 0){break;}
                System.out.print("\n\tERRO! O número não pode ser negativo! ");
            }catch (InputMismatchException e){
                System.out.print("\n\tERRO! O valor deve ser um número inteiro! ");
            }
        }
        int i = numeroInformado;

        System.out.print("\nFatorial de: " + numeroInformado +
                "\n" + numeroInformado + "! = ");
        while (i > 0){
            fatorial = fatorial*i;
            System.out.print(i == 1 ? (i + " = ") : (i + " . "));
            i--;
        }
        System.out.print(fatorial);

        scanner.close();
    }
}
