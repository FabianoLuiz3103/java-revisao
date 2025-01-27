package br.com.fabianoLuiz3103.exercicios.lista08.exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 */
public class TesteAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();


        System.out.println("\nInforme o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("\nInforme a matrícula do aluno: ");
        aluno.matricula = scanner.nextLine();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("\nInforme a " + (i + 1) + "º disciplina: ");
            aluno.disciplinas[i] = scanner.nextLine();
        }

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("\nInforme as notas da disciplina: " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++) {
                double nota = 0;
                while (true){
                    try{
                        System.out.print("\n" + (j + 1) + "º nota: ");
                        nota = scanner.nextDouble();
                        if(nota >= 0 && nota <= 10){
                            aluno.notas[i][j] = nota;
                            break;
                        }
                        System.out.println("\n\tERRO! A nota deve estar entre 0 e 10!");
                    }catch (InputMismatchException e){
                        System.out.println("\n\tERRO! O valor deve ser numérico! (0,00)");
                        scanner.nextLine();
                    }
                }
            }
        }

        aluno.exbirInfo();

        System.out.println();
        for(int i = 0; i < aluno.notas.length; i++){
            System.out.println( aluno.verificarAprovacao(i));
        }

        scanner.close();
    }
}
