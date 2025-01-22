package br.com.fabianoLuiz3103.exercicios.lista03;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa de caixa registradora rudimentar
 */
public class Exercicio027 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precoProduto = 0, dinheiroPagamento, totalCompra = 0;
        int i = 1;

        System.out.print("\n\t\tLOJAS TABAJARA!\n");
        do{
            precoProduto = receberValor(scanner, "\n\tProduto " + i + ": R$ ");
            totalCompra = totalCompra+precoProduto;
            i++;
        }while (precoProduto != 0);
        System.out.print("\n\tTotal: R$ " + formatar(totalCompra) + "\n");


        while (true){
            dinheiroPagamento = receberValor(scanner, "\n\tDinheiro: R$ ");
            if(dinheiroPagamento >= totalCompra){break;}
            totalCompra = (dinheiroPagamento-totalCompra)*(-1.0);
            System.out.print("\n\tVocê ainda deve: R$ " +  formatar(totalCompra) + "\n");
        }

        System.out.print("\n\tTroco: R$ " + formatar(dinheiroPagamento-totalCompra));


        scanner.close();

    }
    private static double receberValor(Scanner scanner, String texto){
        double valor;
        while(true){
            try {
                System.out.print(texto);
                valor = scanner.nextDouble();
                if(valor >= 0){return valor;}
                System.out.println("\n\tERRO! O valor não pode ser negativo! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O preço do produto deve ser numérico! ");
                scanner.nextLine();
            }
        }
    }

    private static String formatar(double valor){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

}
