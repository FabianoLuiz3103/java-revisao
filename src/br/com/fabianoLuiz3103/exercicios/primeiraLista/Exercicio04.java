package br.com.fabianoLuiz3103.exercicios.primeiraLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que pergunte quanto você ganha por hora e a quantidade de horas trabalhas no mês,
 * mostre o salário mensal.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioPorHora = 0.0;
        int horasTrabalhadasMes = 0;

        while (true){
            try{
                System.out.println("Informe quanto você recebe por hora trabalhada: ");
                salarioPorHora = scanner.nextDouble();

                if(salarioPorHora <= 0){
                    System.out.println("O valor recebido por hora deve ser positivo (maior que zero)! ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("O valor recebido por hora deve ser do tipo numérico!");
                scanner.next();
            }
        }

        while (true){
            try{
                System.out.println("Informe quantas horas você trabalha no mês: ");
                horasTrabalhadasMes = scanner.nextInt();

                if(horasTrabalhadasMes <= 0){
                    System.out.println("As horas trabalhadas devem ser positivas (maior que zero)! ");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("As horas trabalhadas devem ser do tipo numérico! ");
                scanner.next();
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("\nVocê recebe R$" + salarioPorHora + " por hora e trabalha " + horasTrabalhadasMes + " horas por mês" +
                ", o seu salário é de: R$" + (salarioPorHora*horasTrabalhadasMes));

        scanner.close();

    }
}
