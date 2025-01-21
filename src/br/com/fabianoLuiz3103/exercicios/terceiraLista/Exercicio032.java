package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que calcula aumento salarial
 */
public class Exercicio032 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Salário em 1996
        double percentual = 0.015;
        double salarioInicial = 1000+(1000*percentual);

        while (true){
            try{
                System.out.println("\n\tInforme o salário inicial do funcionário: ");
                salarioInicial = scanner.nextDouble();
                if(salarioInicial > 0){break;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
        for(int i = 1997; i <= 2025; i++){
            percentual*=2;
            salarioInicial = salarioInicial + (salarioInicial*percentual);
            System.out.println("EM " + i + " O PERCENTUAL FOI +" + (percentual*100) + " O VALOR DO SALÁRIO FICOU R$" + formatar(salarioInicial));
        }


    }

    private static String formatar(Double valor){
        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(valor);
    }
}
