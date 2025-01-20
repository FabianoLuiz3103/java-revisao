package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Calcular número médio de alunos por turma
 */
public class Exercicio023 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeTurmas, quantidadeAlunosTurma, somaTotalAlunos = 0;
        quantidadeTurmas = receberInteiro(scanner, "\n\tInforme a quantidade de turmas: ");

        int i = 0;
        while(i < quantidadeTurmas){
            while (true){
                quantidadeAlunosTurma = receberInteiro(scanner, "\n\tInforme a quantidade de alunos na " + (i+1) + "º turma:");
                if(quantidadeAlunosTurma <= 40){break;}
                System.out.print("\n\tERRO! Uma turma não pode ter mais de 40 alunos!\n" );
            }
            somaTotalAlunos = somaTotalAlunos + quantidadeAlunosTurma;
            i++;
        }
        System.out.print("\n\t SOMA TOTAL DE ALUNOS NAS " + quantidadeTurmas + " TURMAS: " + somaTotalAlunos);
        System.out.print("\n\t NÚMERO MÉDIO DE ALUNOS POR TURMA: " + (somaTotalAlunos/quantidadeTurmas));

        scanner.close();
    }

    private static int receberInteiro(Scanner scanner, String texto){
        int valor;
        while (true){
            try {
                System.out.println(texto);
                valor = scanner.nextInt();
                if(valor > 0){break;}
                System.out.print("\n\tERRO! O valor deve ser maior que zero!\n");
            }catch (InputMismatchException e){
                System.out.print("\n\tERRO! O valor deve ser um número inteiro!\n");
                scanner.nextLine();
            }
        }
        return valor;
    }
}
