package br.com.fabianoLuiz3103.exercicios.terceiraLista;

import java.util.InputMismatchException;
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
            scanner.nextLine();
        }

        while (true){
            try{
                System.out.println("\n\tInforme sua idade: ");
                idade = scanner.nextInt();
                if(idade > 0 && idade < 150){break;}
                System.out.println("\n\tERRO! A idade deve ser maior que 0 e menor que 150! ");

            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }

        while (true){
            try{
                System.out.println("\n\tInforme seu salário: ");
                salario = scanner.nextDouble();
                if(salario > 0){break;}
                System.out.println("\n\tERRO! O salário deve ser maior que 0! ");

            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser do tipo numérico! ");
                scanner.nextLine();
            }
        }

        scanner.nextLine();
        while (true){
            sexo = receberString(scanner, "\n\tInforme seu sexo: " +
                    "\n\t(F) - Feminino;" +
                    "\n\t(M) - Masculino. ");
            if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){break;}
            System.out.println("\n\tERRO! O sexo deve ser \"F\" ou \"M\"");
            scanner.nextLine();
        }
        while (true){
            estadoCivil = receberString(scanner, "\n\tInforme seu estado civil: " +
                    "\n\t(S) - Solteiro;" +
                    "\n\t(C) - Casado;" +
                    "\n\t(V) - Víuvo;" +
                    "\n\t(D) - Divorciado.");
            if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") ||
            estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){break;}
            System.out.println("\n\tERRO! O estado civil deve ser \"S\",\"C\",\"V\" ou \"D\"");
            scanner.nextLine();
        }

        System.out.println("\n-----------------------------------------------" +
                "\n -- CADASTRO REALIZADO COM SUCESSO! " +
                "\nNOME: " + nome +
                "\nIDADE: " + idade +
                "\nSALÁRIO: R$" + salario +
                "\nSEXO: " + sexo +
                "\nESTADO CÍVIL: " + estadoCivil);

        scanner.close();

    }

    private static String receberString(Scanner scanner, String txt){
        System.out.println(txt);
        return scanner.nextLine();
    }
}
