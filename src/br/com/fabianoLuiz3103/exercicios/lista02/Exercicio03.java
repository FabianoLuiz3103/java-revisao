package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba duas letras: "F" ou "M";
 * "F" exibir feminino
 * "M" exibir masculino
 * outra letra - inválido
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sexo;

        System.out.println("\nInforme o sexo (M/F): ");
        sexo = scanner.next().toUpperCase();

        switch (sexo){

            case "F":
                System.out.println("FEMININO!");
            break;
            case "M":
                System.out.println("MASCULINO! ");
            break;
            default:
                System.out.println("SEXO INVÁLIDO! ");
            break;
        }

        scanner.close();
    }
}
