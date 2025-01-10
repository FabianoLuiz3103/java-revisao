package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba a altura de uma pessoa e calcule o peso ideal
 * (72.7*altura)-58
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double altura, pesoIdeal;

        while (true){

            try{
                System.out.println("Informe sua altura em metros: ");
                altura = scanner.nextDouble();
                if(altura >= 100){
                    altura = altura/100;
                }
                if(altura <= 0 || altura > 2.5){
                    System.out.println("A altura deve ser um valor maior que zero e menor que 2.5M! ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("A altura deve ser um valor numérico! \n");
                scanner.nextLine();
            }
        }
        pesoIdeal = (72.7*altura)-58;
        String pesoIdealFormat = df.format(pesoIdeal);
        System.out.println("\nO seu peso ideal é: " + pesoIdealFormat + "Kg.");
        scanner.close();
    }
}
