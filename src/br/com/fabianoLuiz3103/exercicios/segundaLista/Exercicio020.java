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
        //a verificação de par ou ímpar só vale para nº inteiro -> arrumar isso
       System.out.println("\n----------------------------------------------" +
               "\nO NÚMERO " + resultado + "" +
               "\nÉ: " + ((resultado%2==0)? "PAR; " : "ÍMPAR;") +
               "\nÉ: " + ((resultado < 0)? "NEGATIVO; " : "POSITIVO;") +
               "\nÉ: " + ((resultado==(int)resultado)?"INTEIRO. " : "DECIMAL.")

       );

        scanner.close();

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
                        result = numeros[0]/numeros[1];
                    }catch (ArithmeticException e){
                        result =0;
                    }
                    if (Double.isInfinite(result)) {result = 0.0;}
                    break;
                default:
                    result = 0;
            }

        return  result;
    }
}
