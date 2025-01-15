package br.com.fabianoLuiz3103.exercicios.segundaLista;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * @author FabianoLuiz3103
 * --> Calculadora
 */
public class Exercicio020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[2];
        String opcao;
        double resultado;

        for(int i = 0; i < numeros.length; i++){

            while (true){
                try {
                    System.out.println("\n\tInforme o " + (i+1) + "º número: ");
                    numeros[i] = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\n\tERRO! O valor informado deve ser do tipo numérico! ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("-------------------------------------------------");
        while (true){
            System.out.println("\nQual operação deseja realizar?" +
                    "\n(+) - SOMA;" +
                    "\n(-) - SUBTRAÇÃO;" +
                    "\n(*) - MULTIPLICAÇÃO;" +
                    "\n(/) - DIVISÃO;");
            opcao = scanner.next();

            if(opcao.equals("+") || opcao.equals("-") || opcao.equals("*") || opcao.equals("/")){break;}
            System.out.println("\n\tOpção inválida! Deve ser +, -, * ou /");
        }
        resultado = realizarOperacoes(opcao, numeros);

        boolean inteiro = isInteiro(resultado);
        String parOrImpar = parImpar(resultado);
       System.out.println("\n----------------------------------------------" +
               "\nO NÚMERO " + resultado + "" +
               "\nÉ: " + (inteiro? parOrImpar  : " A PARTE INTEIRA DELE É: " + parOrImpar) +
               "\nÉ: " + (negativoOrPositivoOrZero(resultado)) +
               "\nÉ: " + (inteiro?"INTEIRO. " : "DECIMAL.")

       );

        scanner.close();

    }

    private static String negativoOrPositivoOrZero(double numero){
        if(numero < 0){
            return "NEGTIVO";
        } else  if(numero > 0){
            return "POSITIVO";
        }else{
            return "NEUTRO(ZERO)";
        }
    }

    private static boolean isInteiro(double numero){
        return numero==(int)numero;
    }

    private static String parImpar(double numero){
        if((int)numero%2==0){
            return "PAR";
        }else {
            return "ÍMPAR";
        }
    }

    private static double realizarOperacoes(String opcao, double[] numeros){
        double result = 0;
            switch (opcao){
                case "+":
                    result = numeros[0]+numeros[1];
                    break;
                case "-":
                    result = numeros[0]-numeros[1];
                    break;
                case "*":
                    result = numeros[0]*numeros[1];
                    break;
                case "/":
                    try{
                        if (numeros[1] == 0) {
                            result = 0.0;
                        } else {
                            result = numeros[0] / numeros[1];
                        }
                    }catch (ArithmeticException e){
                        result =0;
                    }

                    break;
                default:
                    result = 0;
            }

        return  result;
    }
}
