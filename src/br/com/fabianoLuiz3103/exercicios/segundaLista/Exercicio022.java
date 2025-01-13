package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> calculo preço combustível
 */

public class Exercicio022 {
    //ALCOOL
    private static final double VALOR_ALCOOL = 1.90;
    private static final double PERC_DESC_ATE20_ALCOOL = 0.03;
    private static final double PERC_DESC_MAIS20_ALCOOL = 0.05;

    //GASOLINA
    private static final double VALOR_GASOLINA = 2.50;
    private static final double PERC_DESC_ATE20_GASOLINA = 0.04;
    private static final double PERC_DESC_MAIS20_GASOLINA = 0.06;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double litrosVendidos, precoFinal;
        String tipoCombustivel;
        DecimalFormat df = new DecimalFormat("#.###");

        while (true){
            try {
                System.out.println("\n\tInforme a quantidade litros vendidos: ");
                litrosVendidos = scanner.nextDouble();
                if(litrosVendidos > 0){break;}
                System.out.println("\n\tERRO! A quantidade deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }

        while (true){
            System.out.println("--------------------------------------------------" +
                    "\nInforme o tipo do combustível" +
                    "\n(A) - ÁLCOOL;" +
                    "\n(G) - GASOLINA.\n");
            tipoCombustivel = scanner.next();
            if(tipoCombustivel.equalsIgnoreCase("A") || tipoCombustivel.equalsIgnoreCase("G")){break;}
            System.out.println("\n\tERRO! Tipo de combustível inválido! DEVE SER A ou G");
        }

        if(tipoCombustivel.equalsIgnoreCase("A")){
            precoFinal = calcularPrecoFinalCombustivelDesconto(litrosVendidos, VALOR_ALCOOL, PERC_DESC_ATE20_ALCOOL, PERC_DESC_MAIS20_ALCOOL);
        }else{
            precoFinal = calcularPrecoFinalCombustivelDesconto(litrosVendidos, VALOR_GASOLINA, PERC_DESC_ATE20_GASOLINA, PERC_DESC_MAIS20_GASOLINA);
        }

        System.out.println("\n----------------------------------------------------------------------------------------" +
                "\n\tA QUANTIDADE DE " + converteLetraNome(tipoCombustivel) + " VENDIDA FOI DE: " + litrosVendidos + " LITROS." +
                "\n\tO VALOR DO LITRO É DE R$" + converteLetraPreco(tipoCombustivel) + " E FOI APLICADO " + retornarPercentual(tipoCombustivel, litrosVendidos) + "% DE DESCONTO POR LITRO, OU SEJA -R$" +
                df.format(descontoPorLitro(tipoCombustivel,litrosVendidos))
                + " POR LITRO"+
                "\n\t -- VALOR FINAL SEM DESCONTO É R$" + calculaPrecoSemDesconto(tipoCombustivel, litrosVendidos) + " E O VALOR FINAL COM DESCONTO É R$" + precoFinal);

        scanner.close();

    }

    private static double descontoPorLitro(String tipo, double qtdLitros){
        if(tipo.equalsIgnoreCase("A")){
            return qtdLitros <= 20 ? (VALOR_ALCOOL*PERC_DESC_ATE20_ALCOOL) : (VALOR_ALCOOL*PERC_DESC_MAIS20_ALCOOL);
        }else{
            return qtdLitros <= 20 ? (VALOR_GASOLINA*PERC_DESC_ATE20_GASOLINA) : (VALOR_GASOLINA*PERC_DESC_MAIS20_GASOLINA);
        }
    }

    private static double calculaPrecoSemDesconto(String tipo, double qtdLitros){
        return tipo.equalsIgnoreCase("A") ? (qtdLitros*VALOR_ALCOOL) : (qtdLitros*VALOR_GASOLINA);
    }

    private static double retornarPercentual(String tipo, double qtdLitros){
        if(tipo.equalsIgnoreCase("A")){
                return qtdLitros <= 20 ? (PERC_DESC_ATE20_ALCOOL*100) : (PERC_DESC_MAIS20_ALCOOL*100);
        }else{
            return qtdLitros <= 20 ? (PERC_DESC_ATE20_GASOLINA*100) : (PERC_DESC_MAIS20_GASOLINA*100);
        }
    }

    private static double converteLetraPreco(String tipo){
        return tipo.equalsIgnoreCase("A") ? VALOR_ALCOOL : VALOR_GASOLINA;
    }

    private static String converteLetraNome(String tipo){
        return tipo.equalsIgnoreCase("A") ? "ÁLCOOL" : "GASOLINA";
    }


    private static double calcularPrecoFinalCombustivelDesconto(double qtdLitros, double valorCombustivel, double percentualAteVinte,
                                                                double percentualMaisVinte){
        double valorDesconto;
        if(qtdLitros <= 20){
            valorDesconto = valorCombustivel - (valorCombustivel*percentualAteVinte);
        }else{
            valorDesconto = valorCombustivel - (valorCombustivel*percentualMaisVinte);
        }
        return qtdLitros*valorDesconto;
    }
}
