package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Ver em quantos anos a população do país A vai ser maior ou igual a população de B
 * A - informado pelo usr -> informado pelo urs
 * B - informado pelo usr -> informado pelo urs
 */

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double populacaoA, populacaoB, taxaA, taxaB;
        int anos = 0;
        populacaoA = receberValorDouble(scanner, "\n\tInforme a quantidade de habitantes da cidade A: ");
        taxaA = receberValorDouble(scanner, "\n\tInforme a taxa de crescimento anual (%) da cidade A: ");
        populacaoB = receberValorDouble(scanner, "\n\tInforme a quantidade de habitantes da cidade B: ");
        taxaB = receberValorDouble(scanner, "\n\tInforme a taxa de crescimento anual (%) da cidade B: ");

        if(populacaoA >= populacaoB){
            System.out.println("\n---------------------------------------------------" +
                    "\n\tA POPULAÇÃO A JÁ É MAIOR OU IGUAL A POPULAÇÃO B! " +
                    "\n\t- POPULAÇÃO A: " + populacaoA +
                    "\n\t- POPULAÇÃO B: " + populacaoB);
        }else{
            taxaA = taxaA/100;
            taxaB = taxaB/100;
            while (populacaoA < populacaoB){
                populacaoA = populacaoA + (populacaoA*taxaA);
                populacaoB = populacaoB + (populacaoB*taxaB);
                anos++;
            }
            System.out.println("\n---------------------------------------------------" +
                    "\n\tA POPULAÇÃO A FICOU MAIOR OU IGUAL A POPULAÇÃO B EM " + anos + " ANOS!" +
                    "\n\t- POPULAÇÃO A: " + Math.round(populacaoA) +
                    "\n\t- POPULAÇÃO B: " + Math.round(populacaoB));
        }
        scanner.close();
    }

    private static double receberValorDouble(Scanner scanner, String txt){
        double valor;
        while (true){
            try{
                System.out.println(txt);
                valor = scanner.nextDouble();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor não pode ser menor ou igual a zero! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}
