package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Receber e imprimir 3 números em ordem decrescente
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[3];
        double aux;

        for(int i = 0; i < numeros.length; i++){

            while (true){

                try{
                    System.out.println("\nInforme o " + (i+1) + "º valor: ");
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\nO valor informado deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }


        for(double n: numeros){
            System.out.print(n + ", ");
        }

        scanner.close();
    }
}
