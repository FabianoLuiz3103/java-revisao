package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa de cálculo de folha salário com descontos
 */

public class Exercicio011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorHora, salarioBruto, salarioLiquido,
                totalDescontos, valorIR, valorINSS, valorFGTS, percentualIR;
        int horasTrabalhadasMes;

        valorHora = lerValores(scanner, "Informe quanto você ganha por hora trabalhada:");
        horasTrabalhadasMes = (int) lerValores(scanner,"Informe a quantidade de horas trabalhadas no mês:");

        salarioBruto = horasTrabalhadasMes * valorHora;
        valorFGTS = salarioBruto * 0.11;
        valorINSS = salarioBruto * 0.1;
        percentualIR = calculoPercentualIR(salarioBruto);
        valorIR = salarioBruto * (percentualIR/100);
        totalDescontos = valorINSS + valorIR;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("\n------------------------------------------------------" +
                "\nSalário bruto: (%.2f * %d)                    : R$ %.2f" +
                "\n(-) IR (%.0f%%)                                    : R$ %.2f" +
                "\n(-) INSS (10%%)                                 : R$ %.2f" +
                "\nFGTS (11%%)                                     : R$ %.2f" +
                "\nTotal de descontos                             : R$ %.2f" +
                "\nSalário liquído                                : R$ %.2f"
        , valorHora, horasTrabalhadasMes, salarioBruto, percentualIR, valorIR,
                valorINSS, valorFGTS, totalDescontos, salarioLiquido);

        scanner.close();

    }

    private static double lerValores(Scanner scanner, String texto) {
        double valor;
        while (true) {
            try {
                System.out.println("\n\t" + texto);
                valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("\n\tERRO! O valor deve ser maior que zero.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico!");
                scanner.nextLine();
            }
        }
        return valor;
    }

    private static double calculoPercentualIR(double salarioBruto){
        if(salarioBruto <= 900){
            return 0.0;
        } else if(salarioBruto <= 1500){
            return 5.0;
        } else if(salarioBruto <= 2500){
            return 10.0;
        } else {
            return 20.0;
        }

    }
}
