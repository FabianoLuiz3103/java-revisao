package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> 2 vetores A e B do mesmo tipo e tamanho
 * - B é o inverso de A
 */
public class Exercicio021 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i ++){
            while (true){
                try{
                    System.out.print("\n\tInforme o " + (i+1) + "º número do vetor A: ");
                    vetorA[i] = scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser um número inteiro!");
                    scanner.nextLine();
                }
            }
            //B[9] = A[0]...
            vetorB[vetorA.length-1-i]=vetorA[i];
        }
        System.out.println("\n\n--------------------------------");
        System.out.printf("%-10s  %-10s\n", "VETOR A", "VETOR B");
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("%5d  %8d\n", vetorA[i], vetorB[i]);
        }
        scanner.close();
    }
}
