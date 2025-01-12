package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba uma data e diga se ela é válida
 * dd/mm/aaaa
 */
public class Exercicio016 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dataInformada = "";

        String regx = "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}$";

        while (true){
            System.out.println("\n\tInforme uma data no formato \"dd/mm/aaaa\": ");
            dataInformada = scanner.next();
            if(dataInformada.matches(regx)){
                break;
            } else{
                System.out.println("\n\tERRO! A data não foi informada no formato \"dd/mm/aaaa\"");
                scanner.nextLine();
            }
        }


        if(isDataValida(dataInformada)){
            System.out.println("\n\t" +dataInformada + " é uma data válida!");
        }else {
            System.out.println("\n\t" +dataInformada + " é uma data inválida!");
        }

        scanner.close();
    }

    private static boolean isDataValida(String data){

        String[] dataQuebrada = data.split("/");
        int dia = Integer.parseInt(dataQuebrada[0]);
        int mes = Integer.parseInt(dataQuebrada[1]);
        int ano = Integer.parseInt(dataQuebrada[2]);
        int diasDoMes = 0;
        if(ano > 1900 && ano < 3000){
            if(mes > 0 && mes <= 12){
                diasDoMes = switch (mes) {
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> isBissexto(ano) ? 29 : 28;
                    default -> 31;
                };
            }
        }
        return dia > 0 && dia <= diasDoMes;
    }

    private static boolean isBissexto(int anoInformado){
        return (anoInformado % 4 == 0 && anoInformado % 100 != 0) ||
                (anoInformado % 100 == 0 && anoInformado % 400 == 0);
    }
}
