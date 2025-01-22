package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que exibe os números primos de 1 até N;
 */
public class Exercicio020 {

    private static int numeroDivisoes = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado;

        while (true){
            try{
                System.out.println("\n\tInforme um valor: ");
                numeroInformado = scanner.nextInt();
                if(numeroInformado > 0){break;}
                System.out.println("\n\tERRO! O número deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }
        System.out.print("\n---------------------------------------------------------" +
                "\n\tNúmeros primos de 1 a " + numeroInformado +": ");
        for(int i = 2; i <= numeroInformado; i++){
            if(primo(i)){
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n\tForam realizadas " + numeroDivisoes + " divisões! ");
    }

    private static boolean primo(int numero){
        if(numero == 2 || numero == 3){
            numeroDivisoes++;
            return true;
        }
        for (int i = 2; i <= numero/2; i++){
            numeroDivisoes++;
            if(numero%i==0){return false;}
        }
        return true;
    }
}
