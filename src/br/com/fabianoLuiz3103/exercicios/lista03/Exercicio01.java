package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que pede uma nota entre 0 e 10 e informa se tiver inválida
 * e continua pedindo até entrar um valor válido
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;

            while (true){

                try{
                    System.out.println("\n\tInforme uma nota entre 0 e 10: ");
                    nota = scanner.nextDouble();
                    if(nota >= 0  && nota <= 10){
                        System.out.println("\n\tA nota informada foi: " + nota + " ela é válida! ");
                        break;
                    }
                    System.out.println("\n\tERRO! A nota deve estar entre 0 e 10. ");
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! A nota deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
        }
            scanner.close();
    }
}
