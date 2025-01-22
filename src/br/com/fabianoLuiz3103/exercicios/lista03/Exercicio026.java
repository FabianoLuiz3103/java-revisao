package br.com.fabianoLuiz3103.exercicios.lista03;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que cria uma tabela de preços de pães para uma panificadora
 *  Preço de 1 pão até 50 pães - preço informado pelo usuário
 */
public class Exercicio026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precoPao = 0;

        while (true){
            try{
                System.out.println("\n\tInforme o preço do pão (R$): ");
                precoPao = scanner.nextDouble();
                if (precoPao>0){break;}
                System.out.println("\n\tERRO! O preço do pão deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O preço do pão deve ser numérico! ");
                scanner.nextLine();
            }
        }

        System.out.println("\n----------------------------------------------------------" +
                "\nPREÇO DO PÃO R$" + precoPao +
                "\nPANIFICADORA PÃO DE ONTEM - TABELA DE PREÇOS: ");
        for(int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (formatar(i*precoPao)));
        }

        scanner.close();
    }
    private static String formatar(double valor){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }
}
