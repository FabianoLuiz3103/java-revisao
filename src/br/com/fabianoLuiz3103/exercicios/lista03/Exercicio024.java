package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que calcula o valor total gasto e a media gasta por um colecionador de CDs
 */
public class Exercicio024 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numTotalCds;
        double precoCd, precoTotalCds=0;

        while (true){
            numTotalCds = receberNumero(scanner, "\n\tInforme o número de CDS: ");
            if(numTotalCds - ((int)numTotalCds) == 0){break;}
            System.out.println("\n\tERRO! A quantidade de CDS deve ser um número inteiro! ");
        }

        for(int i = 0; i < numTotalCds; i++){
            precoCd = receberNumero(scanner, "\n\tInforme o preço (R$) do " +(i+1) + "º CD: ");
            precoTotalCds = precoTotalCds+precoCd;
        }
        System.out.println("\n----------------------------------------------------------------" +
                "\n\tO VALOR TOTAL GASTO COM " + numTotalCds + " CDs FOI DE R$" + precoTotalCds +
                "\n\tA MÉDIA É DE R$" + formatar(precoTotalCds/numTotalCds) + " POR CD!");
        scanner.close();
    }

    private static double formatar(double valor){
        double v = valor*100;
        return (int)v/100.0;
    }

    private static double receberNumero(Scanner scanner, String texto){
        double valor;
        while (true){
            try{
                System.out.println(texto);
                valor = scanner.nextDouble();
                if(valor>0.0){break;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
        return valor;
    }
}
