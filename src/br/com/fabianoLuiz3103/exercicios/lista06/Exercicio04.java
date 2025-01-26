package br.com.fabianoLuiz3103.exercicios.lista06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Cálculo média ponderada
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme a " + (i+1) + "º nota:");
                    int nota = scanner.nextInt();
                    if(nota >= 0 && nota <= 10){
                        notas[i] = nota;
                        break;
                    }
                    System.out.println("\n\tERRO! O valor da nota deve ser entre 0 e 10! ");
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
            soma += i < 2?(notas[i]*(i+2)):(notas[i]*(i+3));
        }

        System.out.println("\n\tPARA AS NOTAS:");
        for(int i = 0; i < notas.length; i++){
            System.out.printf("\n%dºBIM: %.2f (*%d)  + %.2f", (i+1), notas[i], (i<2)?(i+2):(i+3) , (i < 2)?(notas[i]*(i+2)):(notas[i]*(i+3)));
        }
        System.out.println("\nMÉDIA PONDERADA DO SEMESTRE: " + (soma/10));
        scanner.close();
    }
}
