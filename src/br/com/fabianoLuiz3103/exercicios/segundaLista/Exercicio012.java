package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que calcula a média de um aluno no semestre
 */
public class Exercicio012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[2];
        double media, soma = 0;
        char conceito;

        for(int i = 0; i < notas.length; i++){
            while (true){
                try{
                    System.out.println("\n\tInforme a " + (i+1) + "º nota:");
                    notas[i]=scanner.nextDouble();
                    if(notas[i] < 0 || notas[i] > 10){
                        System.out.println("\n\tERRO! A nota deve ser um valor de 0 a 10! ");
                        continue;
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
            soma = soma + notas[i];
        }
        media = soma/notas.length;

        conceito = aplicarConceito(media);

        System.out.printf("\n------------------------------------------------" +
                "\nSUAS NOTAS FORAM: [%.2f e %.2f]" +
                "\nSUA MÉDIA FOI: %.2f" +
                "\nSEU CONCEITO FOI: %c" +
                "\nRESULTADO: %s",
                notas[0], notas[1],
                media, conceito, resultadoSemestre(conceito));

        scanner.close();

    }

    private static char aplicarConceito(double media){
        if(media > 9 && media <= 10){
            return 'A';
        }else if (media > 7.5){
            return 'B';
        } else if(media > 6){
            return 'C';
        } else if(media > 4){
            return 'D';
        } else {
            return 'E';
        }
    }

    private static String resultadoSemestre(char conceito){
        String txt = "";
        switch (conceito){
            case 'A':
            case 'B':
            case 'C': txt = "APROVADO!"; break;
            case 'D':
            case 'E': txt = "REPROVADO!"; break;
        }
        return txt;
    }
}
