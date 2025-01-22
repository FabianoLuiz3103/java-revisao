package br.com.fabianoLuiz3103.exercicios.lista01;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça dois números e imprima a soma.
 */

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroUm = 0;
        int numeroDois = 0;
        boolean entradaValida = false;

        while(!entradaValida){
            try{
                System.out.println("Digite o primeiro número: ");
                numeroUm = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o segundo número: ");
                numeroDois = scanner.nextInt();

                entradaValida = true;

            }catch (Exception e) {
                System.out.println("O valor informado deve ser um número inteiro! \n");
                scanner.nextLine();
            }
        }

        System.out.println("A soma de " + numeroUm + " com " + numeroDois + " é igual a: " + (numeroUm+numeroDois));
        scanner.close();

    }
}
