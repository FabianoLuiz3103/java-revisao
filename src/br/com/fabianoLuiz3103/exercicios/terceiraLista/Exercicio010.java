package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe dois numéros inteiros e exibe o intervalo entre eles
 */
public class Exercicio010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[2];
        int soma = 0;
        for (int i = 0; i<numeros.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme o " + (i+1) + "º número: ");
                    numeros[i] = scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }
        System.out.print("\n------------------------------------------------------------" +
                "\nO intervalo entre " + numeros[0] + " e " + numeros[1] + " é: \n");
       if(numeros[0] > numeros[1]){
           for(int i = numeros[0]; i >= numeros[1]; i--){System.out.println(i); soma=soma+i;}
       }else{
           for(int i = numeros[0]; i <= numeros[1]; i++){System.out.println(i);soma=soma+i;}
       }
       System.out.println("\n\t-- E A SOMA DESSES NÚMEROS É: " + soma);
       scanner.close();
    }
}
