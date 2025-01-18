package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que simula eleição entre 3 candidatos
 */
public class Exercicio022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroEleitores,
                votosCandidatoA = 0,
                votosCandidatoB = 0,
                votosCandidatoC = 0;
        String cadidatoEscolhido;

        numeroEleitores = receberInteiro(scanner, "\n\tInforme o número de eleitores: ");
        scanner.nextLine();
        for (int i = 0; i < numeroEleitores; i++){
            while(true){
                System.out.print("\n-------------------------------------------" +
                        "\n\t" + (i+1) + "º eleitor, informe seu voto: " +
                        "\n\t(A) - Candidato A;" +
                        "\n\t(B) - Candidato B;" +
                        "\n\t(C) - Candidato C.");
                cadidatoEscolhido = scanner.nextLine().toUpperCase();
                if(cadidatoEscolhido.equals("A") || cadidatoEscolhido.equals("B") || cadidatoEscolhido.equals("C")){
                    switch (cadidatoEscolhido){
                        case "A" -> votosCandidatoA++;
                        case "B" -> votosCandidatoB++;
                        case "C" -> votosCandidatoC++;
                    }
                    break;
                }
                System.out.print("\n\tERRO! Opção de candidato inválida! ");

            }

        }
        System.out.print("\n-----------------------------------------------------" +
                "\n-----------------------------------------------------" +
                "\n\tA ELEIÇÃO TEVE " + numeroEleitores + " ELEITORES!! " +
                "\n\tO CANDIDATO A RECEBEU: " + votosCandidatoA + " VOTOTS;" +
                "\n\tO CANDIDATO B RECEBEU: " + votosCandidatoB + " VOTOTS;" +
                "\n\tO CANDIDATO C RECEBEU: " + votosCandidatoC + " VOTOTS;");
        scanner.close();
    }

    private static int receberInteiro(Scanner scanner, String txt){
        int valor;
        while (true){
            try {
                System.out.print(txt);
                valor = scanner.nextInt();
                if(valor > 0){break;}
                System.out.print("\n\tERRO! O valor deve ser maior que zero! ");
            }catch (InputMismatchException e){
                System.out.print("\n\tERRO! O valor deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }
        return valor;
    }
}
