package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe o valor de uma dívida e mostra as parcelas e os juros
 */
public class Exercicio033 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorDivida, percentual = 0.10, valorJuros = 0;

        while (true){
            try{
                System.out.println("\n\tInforme o valor da dívida (R$): ");
                valorDivida = scanner.nextDouble();
                if(valorDivida > 0){break;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
        System.out.printf("%-20s%-20s%-25s%-20s%n",
                "VALOR DA DÍVIDA", "VALOR DOS JUROS", "QUANTIDADE DE PARCELAS", "VALOR DA PARCELA");
        System.out.printf("R$ %-18.2fR$ %-18.2f%-25dR$ %-20.2f%n", valorDivida,valorJuros,1,valorDivida);
        for(int i = 3; i <= 12; i+=3){
            valorJuros = valorDivida*percentual;
            double valorDividaJuros = valorDivida + valorJuros;
            percentual+=0.05;
            System.out.printf("R$ %-18.2fR$ %-18.2f%-25dR$ %-20.2f%n", valorDividaJuros,valorJuros,i,(valorDividaJuros /i));
        }

        scanner.close();
    }
}
