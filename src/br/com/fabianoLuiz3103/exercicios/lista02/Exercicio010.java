package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe um salário de um colaborador e faz o reajuste
 */
public class Exercicio010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioInformado;

        while (true){

            try{
                System.out.println("\n\tInforme seu salário em R$:");
                salarioInformado = scanner.nextDouble();

                if(salarioInformado < 0){
                    System.out.println("\n\tERRO! O salário deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("\nERRO! O salário deve ser um valor numérico! ");
                scanner.nextLine();
            }
        }

        if(salarioInformado <= 280){
            calcularReajuste(0.2, salarioInformado);
        } else if(salarioInformado <= 700){
            calcularReajuste(0.15, salarioInformado);
        } else if(salarioInformado <= 1500){
            calcularReajuste(0.1, salarioInformado);
        } else {
            calcularReajuste(0.05, salarioInformado);
        }

        scanner.close();

    }

    private static void calcularReajuste(double percentualReajuste,
                                         double salarioInformado){

        double valorDeAumento = salarioInformado * percentualReajuste;
        double salarioReajustado = salarioInformado + valorDeAumento;

        System.out.printf("\n-------------------------------------------------" +
                        "\nSalário antes do reajuste: R$%.2f" +
                        "\nPercentual de aumento aplicado: %.2f%%" +
                        "\nValor do aumento: R$%.2f" +
                        "\nSalário após aumento: R$%.2f", salarioInformado, (percentualReajuste*100),
                valorDeAumento, salarioReajustado);
    }
}
