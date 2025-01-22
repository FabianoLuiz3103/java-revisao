package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Tabuada com inicio e fim informados pelo usuário
 */
public class Exercicio030 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorTabuada, inicioTabuada, fimTabuada;

        valorTabuada = receberNumeroInteiro(scanner, "\n\tMontar a tabuada de: ");
        inicioTabuada = receberNumeroInteiro(scanner, "\n\tComeçar por: ");

        do{
            fimTabuada = receberNumeroInteiro(scanner, "\n\tTerminar em: ");
            if (inicioTabuada > fimTabuada){
                System.out.println("\n\tERRO! O fim não pode ser menor que o inicio!");
            }
        }while (inicioTabuada > fimTabuada);

        System.out.println("\nVou começar a tabuada do " + valorTabuada + " começando em  " + inicioTabuada + " e terminando em " + fimTabuada + "\n");
        int i = inicioTabuada;
        while (i <= fimTabuada){
            System.out.println("\t"+valorTabuada + " X " + i + " = " + (valorTabuada*i));
            i++;
        }

        scanner.close();
    }

    private static int receberNumeroInteiro(Scanner scanner, String texto){
        int valor;

        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextInt();
                if(valor > 0){return valor;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }
    }
}
