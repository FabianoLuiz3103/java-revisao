package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe 3 lados de um triângulo, valida se é um triângulo mesmo e informa o tipo.
 */
public class Exercicio013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] lados = new double[3];

        for(int i = 0; i < lados.length; i++){

            while (true){

                try{
                    System.out.println("\n\tInforme o " + (i+1) + "º lado do triângulo: ");
                    lados[i] = scanner.nextDouble();

                    if(lados[i] <= 0){
                        System.out.println("\n\tERRO! O lado deve ser um valor positivo! ");
                        continue;
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O lado deve ser um valor numérico! ");
                    scanner.nextLine();
                }
            }
        }

        if(isTriangulo(lados)){
            System.out.println(tipoTriangulo(lados));
        } else {
            System.out.println("\n\tOS LADOS INFORMADOS NÃO FORMAM UM TRIÂNGULO!");
        }

        scanner.close();

    }

    private static boolean isTriangulo(double[] lados){
        return lados[0] + lados[1] > lados[2] &&
                lados[1] + lados[2] > lados[0] &&
                lados[0] + lados[2] > lados[1];
    }

    private static String tipoTriangulo(double[] lados){
        if(lados[0]==lados[1] && lados[1]==lados[2]){
            return "EQUILÁTERO!";
        } else if(lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2]){
            return "ESCALENO";
        }else{
            return "ISÓSCELES";
        }
    }
}
