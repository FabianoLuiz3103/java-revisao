package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Receber temperaturas e dizer a maior e a menor
 */
public class Exercicio029 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temperaturas, maior = 0,
                menor = 0, qtdTemperaturas = 10, somaTemperaturas = 0;

        for(int i = 1; i <= qtdTemperaturas; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme a " + i + "º temperatura: ");
                    temperaturas = scanner.nextDouble();
                    if(i==1){
                        maior = temperaturas;
                        menor = maior;
                    }
                    if(temperaturas > maior){
                        maior = temperaturas;
                    }
                    if(temperaturas < menor){
                        menor = temperaturas;
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
            somaTemperaturas += temperaturas;
        }
        
        System.out.println("\n\tMENOR TEMPERATURA: " + menor + " ºC" +
                "\n\tMAIOR TEMPERATURA: " + maior + " ºC" +
                "\n\tSOMA TEMPERATURAS: " + somaTemperaturas +
                "\n\tMÉDIA TEMPERATURA: " + (somaTemperaturas/qtdTemperaturas) + " ºC");

        scanner.close();
       
    }
}
