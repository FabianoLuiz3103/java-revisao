package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Ler duas notas bimestrais de 10 alunos e calcular a média
 */
public class Exercicio013 {

    private static final int NUMERO_ALUNOS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notasUm = new double[NUMERO_ALUNOS];
        double[] notasDois = new double[notasUm.length];
        double[] resultados = new double[notasUm.length];
        for(int i = 0; i < NUMERO_ALUNOS; i++){
            System.out.println("\n\tAluno " + (i+1) + ": ");
            notasUm[i] = receberDouble(scanner, 1);
            notasDois[i] = receberDouble(scanner, 2);
            resultados[i] = (notasUm[i]+notasDois[i])/2;
        }
        System.out.printf("\n\n%-10s %-10s %-10s %-10s %-10s\n", "ALUNO", "1ºBIM", "2ºBIM", "MÉDIA", "RESULTADO");
        for(int i = 0; i < notasUm.length; i++){
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s\n", (i+1), notasUm[i], notasDois[i], resultados[i], resultadoBimestre(resultados[i]));
        }
        scanner.close();
    }

    private static String resultadoBimestre(double valor){
        if(valor >= 7){
            return "APROVADO!";
        }
        return "REPROVADO!";
    }

    private static double receberDouble(Scanner scanner, int numNota){
        double nota;
        while (true){
            try{
                System.out.print("\n\t\tInforme sua " + numNota + "º nota: ");
                nota = scanner.nextDouble();
                if(nota >= 0 && nota <= 10){
                    return nota;
                }
                System.out.print("\n\tERRO! A nota deve ser entre 0 e 10\n");
            }catch (InputMismatchException e){
                System.out.print("\n\tERRO! O valor deve ser do tipo numérico!\n ");
                scanner.nextLine();
            }
        }
    }

}
