package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça as 4 notas bimestrais (0 a 10) e mostre a média
 * break -> para o loop;
 * continue -> volta o loop;
 */

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            while(true) {
                try {
                    System.out.println("Informe a " + (i+1) + "ª nota: ");
                    double nota = scanner.nextDouble();

                    if(!(nota >= 0 && nota <= 10)){
                        System.out.println("A nota deve ser um valor entre 0 e 10!\n");
                        continue;
                    }
                    notas[i] = nota;
                    break;
                } catch (Exception e) {
                    System.out.println("A nota deve ser um valor numérico!\n");
                    scanner.next();
                }
            }
            soma = soma + notas[i];
        }

        System.out.println("\n-------------------------\n");
        System.out.println("A média é igual a: " + (soma/notas.length));

        scanner.close();
    }
}
