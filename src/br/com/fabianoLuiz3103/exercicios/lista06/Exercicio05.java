package br.com.fabianoLuiz3103.exercicios.lista06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Ler 3 valores e retornar o maior, a soma dos dois maiores e a ordem crescente
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        for(int i = 0; i < numeros.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme o "+(i+1)+"º número:");
                    numeros[i]= scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo inteiro! ");
                    scanner.nextLine();
                }
            }
        }
        ordenar(numeros);
        System.out.print("NÚMEROS ORDEM CRESCENTE: ");
        for(int n:numeros){
            System.out.print(n + ", ");
        }
        System.out.println("\nMAIOR NÚMERO: " + numeros[numeros.length-1]);
        System.out.println("SOMA 2 MAIORES: " +(numeros[numeros.length-1]+numeros[numeros.length-2]));

        scanner.close();
    }
    private static void ordenar(int[] vetor){
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length-1; j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
}
