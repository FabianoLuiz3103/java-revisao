package br.com.fabianoLuiz3103.exercicios.lista06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Receber a idade de uma pessoa em anos, meses e dias e retornar só em dias
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anos, meses, dias, diasTotais;

        System.out.print("\n--> DIGITE SUA IDADE EXPRESSA EM ANOS, MESES E DIAS: ");
        anos = receberInteiro(scanner, "\n\tInforme os anos: ", 'a');
        meses = receberInteiro(scanner, "\n\tInforme os meses: ", 'm');
        dias = receberInteiro(scanner, "\n\tInforme os dias: ", 'd');

        diasTotais = (anos*365) + (meses*30) + dias;

        System.out.printf("\n----------------------------------------------" +
                "\n\tVOCÊ TEM %d ANOS, %d MESES e %d DIAS;" +
                "\n\tSUA IDADE SÓ EM DIAS É %d DIAS!", anos, meses, dias, diasTotais );

        scanner.close();
    }

    private static int receberInteiro(Scanner scanner, String texto, char tipo){
        int valor;
        while (true){
            try{
                System.out.print(texto);
                valor = scanner.nextInt();
                if(tipo=='a' && valor > 0||
                        tipo=='m' && valor >= 0 && valor < 12||
                        tipo=='d' && valor >= 0 && valor <= 30){return valor;}
                System.out.print("\n\tERRO! Valor inválido!");

            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser um número inteiro! ");
                scanner.nextLine();
            }
        }
    }
}
