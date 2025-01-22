package br.com.fabianoLuiz3103.exercicios.lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça uma temperatura em Farenheit e converta para Celsius.
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double temperaturaFarenheit = 0.0;
        double temperaturaCelsius = 0.0;


        while(true){
            try{
                System.out.println("\nInforme uma temperatura em graus Farenheit (°F): ");
                temperaturaFarenheit = scanner.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("A temperatura deve ser um valor numérico!! ");
                scanner.nextLine();
            }
        }

        temperaturaCelsius =  (5*(temperaturaFarenheit-32)/9);
        String temperaturaCelsiusFormat = df.format(temperaturaCelsius);

        System.out.println("\n" + temperaturaFarenheit + "°F equivale a " + temperaturaCelsiusFormat + "°C");

        scanner.close();
    }
}
