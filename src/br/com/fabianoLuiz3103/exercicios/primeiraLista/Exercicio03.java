package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que cálcule a área de um quadrado e exiba o dobro dessa área para o usuário
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double ladoQuadrado = 0.0;
        double areaQuadrado = 0.0;

        while(true){
        try{
                System.out.println("\nInforme o lado do quadrado: ");
                ladoQuadrado = scanner.nextDouble();

                if(ladoQuadrado <= 0){
                    System.out.println("\nO lado do quadrado deve ser maior que zero! ");
                    continue;
                }
                break;
        }catch (Exception e){
            System.out.println("\nO lado do quadrado deve ser do tipo numérico! ");
            scanner.next();
        }
        }
        areaQuadrado = Math.pow(ladoQuadrado, 2);
        System.out.println("A área do quadrado é igual a: " + areaQuadrado
                + " e o dobro da área é igual a: " + (areaQuadrado * 2));

        scanner.close();

    }
}
