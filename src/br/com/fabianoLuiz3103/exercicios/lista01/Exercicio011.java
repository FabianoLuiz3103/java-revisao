package br.com.fabianoLuiz3103.exercicios.lista01;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Calculo de salário líquido após descontar INSS, IR e sindicato;
 * --> Receber valor ganho por hora e total de horas trabalhadas mês
 */
public class Exercicio011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioPorHora = 0.0, salarioBruto, vlINSS, vlIR, vlSindicato, salarioLiquido;
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
            }finally {
                scanner.close();
            }
        }

        salarioBruto = horasTrabalhadasMes * salarioPorHora;
        vlINSS = salarioBruto*0.08;
        vlIR = salarioBruto*0.11;
        vlSindicato = salarioBruto*0.05;
        salarioLiquido = salarioBruto - vlINSS -vlIR -vlSindicato;

        System.out.println("\n-----------------------------------------");

        System.out.printf("+ Salário bruto: R$%.2f"
                + "%n- IR(11%%): R$%.2f"
                + "%n- INSS(8%%): R$%.2f"
                + "%n- Sindicato(5%%): R$%.2f"
                + "%n= Salário liquído: R$%.2f", salarioBruto,
                vlIR, vlINSS, vlSindicato, salarioLiquido);
    }
}
