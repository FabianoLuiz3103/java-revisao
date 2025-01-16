package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.Scanner;
import java.util.WeakHashMap;

/**
 * @author FabianoLuiz3103
 * --> Programa que valida informações de cadastro
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        while (true){
            nome = receberString(scanner, "\n\tInforme o seu nome: ");
            if(nome.length() > 3){break;}
            System.out.println("\n\tERRO! O nome deve ter mais que 3 caracteres! ");
        }
        while (true){
            sexo = receberString(scanner, "\n\tInforme seu sexo: " +
                    "\n\t(F) - Feminino;" +
                    "\n\t(M) - Masculino. ");
            if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){break;}
            System.out.println("\n\tERRO! O sexo deve ser \"F\" ou \"M\"");
        }
        while (true){
            estadoCivil = receberString(scanner, "\n\tInforme seu estado civil: " +
                    "\n\t(S) - Solteiro;" +
                    "\n\t(C) - Casado;" +
                    "\n\t(V) - Víuvo;" +
                    "\n\t(D) - Divorciado.");
            if(sexo.equalsIgnoreCase("S") || sexo.equalsIgnoreCase("C") ||
            sexo.equalsIgnoreCase("V") || sexo.equalsIgnoreCase("D")){break;}
            System.out.println("\n\tERRO! O sexo deve ser \"S\",\"C\",\"V\" ou \"D\"");
        }

    }

    private static String receberString(Scanner scanner, String txt){
        System.out.println(txt);
        return scanner.nextLine();
    }
}
