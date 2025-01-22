package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe base e expoente e calcula a potência
 */
public class Exercicio012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long base, expoente, resultado = 1;
        boolean isNegativo =  false;
        base = receberValorInteiro(scanner, "\n\tInforme um valor para a base: ");
        expoente = receberValorInteiro(scanner, "\n\tInforme um valor para o expoente: ");

        if(expoente < 0){
            expoente = expoente * (-1);
            isNegativo = true;
        }
        for(int i = 0; i <= expoente-1; i++){
            resultado = resultado * base;
        }
        System.out.println(isNegativo?"1/"+resultado : resultado);


        scanner.close();
    }
    private static long receberValorInteiro(Scanner scanner, String texto){
        while (true){
            try{
                System.out.println(texto);
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
            }
        }
    }
}
