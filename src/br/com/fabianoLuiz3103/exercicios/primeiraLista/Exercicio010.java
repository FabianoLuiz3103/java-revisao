package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe o peso em kg de um saco de peixe, se ultrapassar
 * 50kg uma multa deve ser calculada -> R$4,00 por cada kg excedente.
 */
public class Exercicio010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pesoPeixe, pesoExcedente, valorMulta;

        while (true){

            try{
                System.out.println("Informe o peso da pesca de hoje: ");
                pesoPeixe = scanner.nextDouble();

                if(pesoPeixe <= 0){
                    System.out.println("\nO valor do peso deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("O valor do peso deve ser numérico!! ");
                scanner.nextLine();
            } finally {
                scanner.close();
            }
        }

        pesoExcedente = pesoPeixe - 50.00;
        valorMulta = pesoExcedente * 4.00;

        System.out.println("\n------------------------------------------------");
        System.out.println("Olá, pescador! Hoje o sr. pescou " + pesoPeixe + "Kg de peixe!");
        System.out.println("A quantidade máxima permitida sem multa é de 50Kg, o sr. excedeu em: " + pesoExcedente + "Kg.");
        System.out.println("A multa por exceder é de R$4,00 por Kg excedente, a multa do sr. é de: R$" + valorMulta);
    }
}
