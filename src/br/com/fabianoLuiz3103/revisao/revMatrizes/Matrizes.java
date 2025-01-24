package br.com.fabianoLuiz3103.revisao.revMatrizes;

public class Matrizes {

    public static void main(String[] args) {

        //3 linhas - 4 colunas
        double[][] notasAlunos = new double[3][4];

        //4 notas do aluno 0 - Primeiro aluno
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        //4 notas do aluno 1 - Segundo aluno
        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 10;

        //4 notas do aluno 2 - Terceiro aluno
        notasAlunos[2][0] = 5;
        notasAlunos[2][1] = 4;
        notasAlunos[2][2] = 6;
        notasAlunos[2][3] = 6.5;

        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("\nCalculando a média de cada aluno: ");
        double soma;
        for(int i = 0; i < notasAlunos.length; i++){
            soma=0;
            for(int j = 0; j < notasAlunos[i].length; j++){
                soma+=notasAlunos[i][j];
            }
            System.out.println("Média do aluno: " + i + " é: " + (soma/4));
        }

        //declarando matrizes com valores
        double[] notasAluno1 = {7,8,9,10};
        double[][] notasAlunos2 = {{7,8,9,10},{10,10,8,9}};

    }
}