package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que simula um caixa eletrônico que vai receber um valor a sacar
 * e informar a quantidade de notas que vão ser usadas no saque
 * notas: 1,5,10,50 e 100
 */
public class Exercicio018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorSaque = 0,
                nUm = 0,
                nCinco = 0,
                nDez = 0,
                nCinquenta = 0,
                nCem = 0;

        while (true){

            try {
                System.out.println("\n\tInforme o valor a ser sacado: ");
                valorSaque = scanner.nextInt();
                if(valorSaque >= 10 && valorSaque <= 600){break;}
                System.out.println("\n\tERRO! O valor do saque deve estar entre R$10,00 e R$600,00");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor a sacar deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }

        nCem = valorSaque/100;
        nCinquenta = (valorSaque%100)/50;
        nDez = (valorSaque%50)/10;
        nCinco = (valorSaque%10)/5;
        nUm = (valorSaque % 5);


        System.out.println("\n-------------------------------------------");
        System.out.println("PARA SACAR R$" + valorSaque + " VAI SER NECESSÁRIO:");
        if (nCem > 0) System.out.println(nCem + (nCem == 1 ? " nota de R$100,00" : " notas de R$100,00"));
        if (nCinquenta > 0) System.out.println(nCinquenta + (nCinquenta == 1 ? " nota de R$50,00" : " notas de R$50,00"));
        if (nDez > 0) System.out.println(nDez + (nDez == 1 ? " nota de R$10,00" : " notas de R$10,00"));
        if (nCinco > 0) System.out.println(nCinco + (nCinco == 1 ? " nota de R$5,00" : " notas de R$5,00"));
        if (nUm > 0) System.out.println(nUm + (nUm == 1 ? " nota de R$1,00" : " notas de R$1,00"));


        scanner.close();
    }
}
