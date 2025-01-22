package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Calcular equação do segundo grau
 */
public class Exercicio014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, xUm, xDois;
        a = lerDoublePositivo(scanner, 'a');
        if(a == 0){
            System.out.println("\n\t-------------------------------------------------" +
                    "\nA EQUAÇÃO NÃO É DE SEGUNDO GRAU!! ENCERRANDO...");
        } else {
            b = lerDoublePositivo(scanner, 'b');
            c = lerDoublePositivo(scanner, 'c');
            delta = Math.pow(b,2) - 4*a*c;

            if(delta < 0){
                System.out.println("\n\t-------------------------------------------------" +
                        "\nO DELTA É NEGATIVO, A EQUAÇÃO NÃO POSSUÍ RAÍZES REAIS!! ENCERRANDO...");
            } else if(delta == 0){
                xUm = (-b + Math.sqrt(delta))/(2*a);
                xDois = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("\n\t-------------------------------------------------" +
                        "\nO DELTA É ZERO, A EQUAÇÃO POSSUÍ UMA RAIZ REAL!!" +
                        "\nX1: " + xUm + " e X2: " + xDois);
            } else {
                xUm = (-b + Math.sqrt(delta))/(2*a);
                xDois = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("\n\t-------------------------------------------------" +
                        "\nO DELTA É POSITIVO, A EQUAÇÃO POSSUÍ DUAS RAÍZES REAIS!!" +
                        "\nX1: " + xUm + " e X2: " + xDois);
            }

        }

        scanner.close();

    }

    private static double lerDoublePositivo(Scanner scanner, char letra){
        while (true){

            try{
                System.out.println("\n\tInforme o valor de " + letra + ":");
                return scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("\n\t ERRO! O valor de " + letra + " deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}
