package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba 2 notas parciais de um aluno, calcule a média e retorne se está aprovado ou não
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[2];
        double media;

        for(int i = 0; i < notas.length; i++){

            while (true){

                try {
                    System.out.println("\nInforme sua " + (i+1) + "° nota:");
                    notas[i] = scanner.nextDouble();

                    if(notas[i] < 0 || notas[i] > 10){
                        System.out.println("\nA nota deve estar entre 0 e 10");
                        continue;
                    }
                    break;

                }catch (InputMismatchException e){
                    System.out.println("\nO valor informado deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }

        media = (notas[0]+notas[1])/2;

        if(media == 10){
            System.out.println("\n\tSUA MÉDIA É: " + media + " VOCÊ ESTÁ APROVADO COM DISTINÇÃO! ");
        } else if(media >= 7) {
            System.out.println("\n\tSUA MÉDIA É: " + media + " VOCÊ ESTÁ APROVADO! ");
        } else {
            System.out.println("\n\tSUA MÉDIA É: " + media + " VOCÊ ESTÁ REPROVADO! ");
        }

        scanner.close();
    }
}
