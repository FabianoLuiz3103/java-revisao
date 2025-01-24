package br.com.fabianoLuiz3103.revisao.revMatrizes;

import java.util.Scanner;

public class MatrizesIrregulares {

    public static void main(String[] args) {

        // 3 linhas -> cada linha vai ter uma quantidade de colunas diferentes
        int[][] arrayIrregular = new int[3][];
        arrayIrregular[0] = new int[1];
        arrayIrregular[1] = new int[2];
        arrayIrregular[2] = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        int numeroEntrevistados = scanner.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];

        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.println("\nOlá " + (i+1) + "º entrevistado! Quantos filhos você tem: ");
            int numeroFilhos = scanner.nextInt();
            scanner.nextLine();
            nomesFilhos[i] = new String[numeroFilhos];
            for(int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("\n\tInforme o nome do seu " + (j+1) + "º filho: " );
                nomesFilhos[i][j] = scanner.nextLine();
            }
        }

        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.print("Filhos " +(i+1) + "º Entrevistado: ");
            for(int j = 0; j < nomesFilhos[i].length; j++){
               System.out.print( nomesFilhos[i][j]+ ", ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
