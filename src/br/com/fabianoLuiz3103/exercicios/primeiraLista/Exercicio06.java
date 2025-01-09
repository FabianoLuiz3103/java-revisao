package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça uma temperatura em Celsius e converta para Farenheit.
 */

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double temperaturaCelsius = 0.0;
        double temperaturaFarenheit = 0.0;



        while(true){
            try{
                System.out.println("\nInforme uma temperatura em graus Celsius (°C): ");
                temperaturaCelsius = scanner.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("A temperatura deve ser um valor numérico!! ");
                scanner.nextLine();
            }
        }

        temperaturaFarenheit = (temperaturaCelsius * 9 /5 ) + 32;
        String temperaturaFarenheitFormat = df.format(temperaturaFarenheit);

        System.out.println("\n" + temperaturaCelsius + "°C equivale a " + temperaturaFarenheitFormat + "°F");

        scanner.close();
    }
}
