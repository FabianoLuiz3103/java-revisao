package br.com.fabianoLuiz3103.exercicios.lista012.exercicio02;

import java.lang.classfile.constantpool.PoolEntry;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso();
        Professor professor = new Professor();
        Aluno[] alunos = new Aluno[5];

        //professor
        professor.setNome("Sérgio Ricardo Rota");
        professor.setDepartamento("Desenvolvimento");
        professor.setEmail("sergioRota123@gmail.com");

        //curso
        curso.setNome("Sistemas de informação");
        curso.setHorario("08:00 - 12:00");
        curso.setProfessor(professor);

        for(int i = 0; i < alunos.length; i++){
            System.out.println("\n\n\t\t>>>>>> ALUNO " + (i+1) + " <<<<<<");
            Aluno aluno = new Aluno();
            System.out.println("\n\tInforme o nome: ");
            aluno.setNome(scanner.nextLine());
            System.out.println("\n\tInforme a matrícula: ");
            aluno.setMatricula(scanner.nextLine());
            double[] notas = new double[4];
            for(int j = 0; j < aluno.getNotas().length; j++){
                notas[j] = receberNota(scanner, "\n\t\tInforme a " + (j+1) + "º nota do " + aluno.getNome() + ": ");
            }
            aluno.setNotas(notas);
            alunos[i] = aluno;
            scanner.nextLine();
        }
        curso.setAlunos(alunos);
        curso.exibirInfo();

        scanner.close();
    }

    private static double receberNota(Scanner scanner, String texto){
        double valor;
        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextDouble();
                if(valor >= 0 && valor <= 10){return valor;}
                System.out.println("\n\tERRO! A nota deve estar entre 0 e 10!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }
    }
}
