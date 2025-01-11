package br.com.fabianoLuiz3103.exercicios.segundaLista;

import javax.xml.parsers.SAXParser;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe o preço de 3 produtos e informa qual deve comprar (mais barato)
 */

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] precoProdutos = new double[3];
        double menorPreco;
        int numeroProduto;

        for(int i = 0; i < precoProdutos.length; i++){

            while (true){
                try {
                    System.out.println("\nInforme o preço do " +  (i+1) + "º produto:");
                    precoProdutos[i] = scanner.nextDouble();
                    if(precoProdutos[i] <= 0){
                        System.out.println("\nO preço do produto deve ser maior que zero! ");
                        continue;
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\nERRO! O preço deve ser um valor numérico! ");
                    scanner.nextLine();
                }
            }
        }

        menorPreco = precoProdutos[0];
        numeroProduto = 1;
        if(precoProdutos[1] < menorPreco){
            menorPreco = precoProdutos[1];
            numeroProduto = 2;
        } if(precoProdutos[2] < menorPreco){
            menorPreco = precoProdutos[2];
            numeroProduto = 3;
        }

        System.out.printf("\n\tOs preços informados foram: R$%.2f - R$%.2f - R$%.2f e o menor preço é R$%.2f. " +
                        "\n\tVocê deve comprar o %dº produto!!!",
                precoProdutos[0],
                precoProdutos[1],
                precoProdutos[2],
                menorPreco, numeroProduto);

    }
}
