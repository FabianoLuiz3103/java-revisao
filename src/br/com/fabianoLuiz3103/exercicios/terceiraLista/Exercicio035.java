package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa para uma lanchonete;
 */
public class Exercicio035 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigoRecebido = 1, quantidadeProduto = 0;
        double valorTotal = 0, precoProduto = 0;
        StringBuilder notaFiscal = new StringBuilder();

        while (codigoRecebido != 0){
            while (true){
                try{
                    System.out.println("\n\tInforme o código do produto:" +
                            "\n\tOBS -> CÓDIGO NEGATIVO OU ZERO ENCERRA A COMPRA!");
                    codigoRecebido = scanner.nextInt();
                    if(codigoValido(codigoRecebido) || codigoRecebido == 0){break;}
                    System.out.println("\n\tERRO! O valor do código informado é inválido!");
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                    scanner.nextLine();
                }
            }
            if(codigoValido(codigoRecebido)) {
                while (true) {
                    try {
                        System.out.println("\n\tInforme a quantidade desejada: ");
                        quantidadeProduto = scanner.nextInt();
                        if (quantidadeProduto > 0) {
                            break;
                        }
                        System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
                    } catch (InputMismatchException e) {
                        System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                        scanner.nextLine();
                    }
                }

                precoProduto = retornarPrecoProduto(codigoRecebido);
                valorTotal=valorTotal+(precoProduto*quantidadeProduto);
                notaFiscal.append(retonarNota(codigoRecebido, quantidadeProduto));
            }
        }
        System.out.println("\n--------------------------------------------" +
                "\n"+notaFiscal+
                "\n\t\tTOTAL = R$" + formatar(valorTotal));

        scanner.close();
    }

    private static String retonarNota(int codigo, int quantidade){
        return switch (codigo){
            case 100 -> "Cachorro quente -> R$1,20 * " + quantidade + "un. = R$" + formatar(1.2*quantidade) + "\n";
            case 101 -> "Bauru simples -> R$1,30 * " + quantidade + "un. = R$" + formatar(1.3*quantidade) + "\n";
            case 102 -> "Bauru com ovo -> R$1,50 * " + quantidade + "un. = R$" + formatar(1.5*quantidade) + "\n";
            case 103 -> "Hambúrguer -> R$1,20 * " + quantidade + "un. = R$" + formatar(1.2*quantidade) + "\n";
            case 104 -> "Cheeseburguer -> R$1,30 * " + quantidade + "un. = R$" + formatar(1.3*quantidade) + "\n";
            case 105 -> "Refrigerante -> R$1,00 * " + quantidade + "un. = R$" + formatar(1.0*quantidade) + "\n";
            default -> "";
        };
    }

    private static double retornarPrecoProduto(int codigo){
        return switch (codigo){
            case 100,103 -> 1.20;
            case 101,104 -> 1.30;
            case 102 -> 1.50;
            case 105 -> 1.00;
            default -> 0.0;
        };
    }

    private static String formatar(double valor){
        DecimalFormat df = new DecimalFormat("###.00");
        return df.format(valor);
    }

    private static boolean codigoValido(int codigo){
        return switch (codigo){
            case 100,101,102,103,104,105 -> true;
            default -> false;
        };
    }
}
