package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe as idades das pessoas e informe a média de idade
 */
public class Exercicio021 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas, soma = 0, media, idade;
        String aTurmaE;

        quantidadePessoas = receberInteiro(scanner, "\n\tInforme o número de pessoas na turma: ");

        for (int i = 0; i < quantidadePessoas; i++){
            idade = receberInteiro(scanner, "\n\tInforme a " + (i+1) + "º idade: ");
            soma = soma + idade;
        }
        media = soma/quantidadePessoas;
        if(media > 0 && media <= 25){
            aTurmaE = "JOVEM";
        }else if(media >= 26 && media <= 60){
            aTurmaE = "ADULTA";
        }else{
            aTurmaE = "IDOSA";
        }
        System.out.print(soma);
        System.out.print("\n-----------------------------------------------------------" +
                "\n\tA MÉDIA DE IDADE DA TURMA É: " + media + " ANOS! --> A TURMA É: " + aTurmaE);

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
