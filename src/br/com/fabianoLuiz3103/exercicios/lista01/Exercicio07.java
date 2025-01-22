package br.com.fabianoLuiz3103.exercicios.lista01;


import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que peça 2 números inteiros e 1 real. Calcule e mostre:
 * a) O produto do dobro do primeiro com metade do segundo;
 * b) A soma do tripo do primeiro com o terceiro;
 * c) O terceiro elevado ao cubo
 */

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorUm, valorDois;
        double valorTres, rA, rB, rC;

        valorUm = receberNumeroInteiro(1, scanner);
        valorDois = receberNumeroInteiro(2, scanner);

        while (true){
            try{
                System.out.println("Informe um número real: ");
                valorTres = scanner.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("O valor informado deve ser do tipo numérico!!");
                scanner.nextLine();
            }
        }

        rA = (valorUm*2.0)*(valorDois/2.0);
        rB = (valorUm*3)+valorTres;
        rC = Math.pow(valorTres, 3);

        System.out.println("\n---------------------------------------------------\n");
        System.out.println("A) " + rA);
        System.out.println("B) " + rB);
        System.out.println("B) " + rC);
        scanner.close();
    }

    private static int receberNumeroInteiro(int index, Scanner scan){
        int valor;
        while (true){
            try{
                System.out.println("Informe o " + index + "º valor inteiro: ");
                valor = scan.nextInt();
                break;
            }catch(Exception e){
                System.out.println("O valor informado deve ser um número inteiro!!");
                scan.nextLine();
            }
        }
        return valor;
    }
}
