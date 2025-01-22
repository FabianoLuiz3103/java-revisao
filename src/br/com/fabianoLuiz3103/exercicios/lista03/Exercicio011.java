package br.com.fabianoLuiz3103.exercicios.lista03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Gerador de tabuada
 */
public class Exercicio011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorTabuada;

        while (true){
            try{
                System.out.println("\n\tQual tabuada você quer ver? ");
                valorTabuada = scanner.nextInt();
                if(valorTabuada > 0){break;}
                System.out.println("\n\tERRO! O valor da tabuada deve ser maior que ZERO! ");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }

        System.out.println("\n\tTABUADA DE " + valorTabuada + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(valorTabuada + " X " + i + " = " + (valorTabuada*i));
        }
        scanner.close();
    }
}
