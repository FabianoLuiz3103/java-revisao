package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 */
public class Exercicio021 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?",
        };
        String opcao;
        int quantidadeSim = 0;

        System.out.println("\n-----------------------------------------------" +
                "\n\tINFORME:" +
                "\n\t(S) - SIM;" +
                "\n\t(N) - NÃO.\n");
        for(int i = 0; i < perguntas.length; i++){
            while (true){
                System.out.println(perguntas[i]);
                opcao = scanner.next();
                if(opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("N")){
                    if (opcao.equalsIgnoreCase("S")) {
                        quantidadeSim++;
                    }
                    break;
                }else{
                    System.out.println("\n\tOPÇÃO INVÁLIDA! INFORME (S)-SIM | (N)-NÃO!\n");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("\n----------------------------------------" +
                "\n\tRESULTADO:\n");
        switch (quantidadeSim){
            case 2 -> System.out.println("\n\tVOCÊ É SUSPEITO!");
            case 3,4 -> System.out.println("\n\tVOCÊ É CÚMPLICE!");
            case 5 -> System.out.println("\n\tVOCÊ É O ASSASINO!!!!");
            default -> System.out.println("\n\tVOCÊ É INOCENTE! ");
        }
        scanner.close();
    }
}
