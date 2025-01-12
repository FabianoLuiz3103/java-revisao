package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que recebe M, V, N e retorna uma mensagem de bom dia, boa tarde ou boa noite
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String turnoEstudo;

        while (true){

            System.out.println("\nInforme em qual turno você estuda: " +
                    "\n(M) - Matutino;" +
                    "\n(V) - Vespertino;" +
                    "\n(N) - Noturno.");
            turnoEstudo = scanner.next().toUpperCase();

            if(turnoEstudo.length() != 1){
                System.out.println("\nERRO! Turno deve ter um caractere! ");
                continue;
            }
            break;
        }

        switch (turnoEstudo){

            case "M":
                System.out.println("\n\tBOM DIA!");
            break;
            case "V":
                System.out.println("\n\tBOA TARDE! ");
            break;
            case "N":
                System.out.println("\n\tBOA NOITE!");
            break;
            default:
                System.out.println("\n\tVALOR INVÁLIDO!");
            break;

        }
        scanner.close();
    }
}
