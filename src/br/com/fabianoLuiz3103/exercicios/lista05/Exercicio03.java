package br.com.fabianoLuiz3103.exercicios.lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Matriz 3x3 -> preencher com valores do teclado e mostrar qtd pares e qtd ímpares
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int qtdPares=0, qtdImpares=0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                while (true){
                    try{
                        System.out.print("\n\tInforme um valor para a posição [" + i + "," + j + "] da Matriz: " );
                        matriz[i][j]= scanner.nextInt();
                        if(matriz[i][j]%2==0) {
                            qtdPares++;
                        }else{
                            qtdImpares++;
                        }
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                        scanner.nextLine();
                    }
                }
            }
        }
        System.out.println("\n----------------------------------------------------" +
                "\nMATRIZ 3X3:" +
                "\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nQUANTIDADE PARES: " + qtdPares +
                "\nQUANTIDADE ÍMPARES: " + qtdImpares);
        scanner.close();
    }
}
