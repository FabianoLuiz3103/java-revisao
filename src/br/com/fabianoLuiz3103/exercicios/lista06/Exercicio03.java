package br.com.fabianoLuiz3103.exercicios.lista06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Calcular custo final de um carro para o consumidor
 */
public class Exercicio03 {

    private static final double PERC_DISTRIBUIDOR = 0.28;
    private static final double PERC_IMPOSTOS = 0.45;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double custoFabrica, precoFinal;

        while (true){
            try {
                System.out.println("\n\tINFORME O CUSTO DE FÁBRICA DO CARRO: ");
                custoFabrica = scanner.nextDouble();
                if(custoFabrica > 0){break;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e) {
                System.out.println("\n\tERRO! O valor dever um número! ");
                scanner.nextLine();
            }
        }
        double distribuidor =custoFabrica*PERC_DISTRIBUIDOR;
        double impostos =custoFabrica*PERC_IMPOSTOS;
        precoFinal = custoFabrica+distribuidor+impostos;
        System.out.println("\n--------------------------------------------" +
                "\n\tCUSTO DE FÁBRICA: R$" + custoFabrica +
                "\n\tTAXA DISTRIBUIDOR (28%): +R$" + distribuidor +
                "\n\tTAXA IMPOSTOS (45%): +R$" + impostos +
                "\n\tPREÇO FINAL DO CARRO: R$" + precoFinal);
    }
}
