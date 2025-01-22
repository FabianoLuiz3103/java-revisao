package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Vetor A que armazena o valor do dólar em relação ao real
 * de $1 até $50 doláres
 */
public class Exercicio014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] vetorA = new double[50];
        double cotacaoHoje;

        while (true){
            try{
                System.out.print("\n\tInforme a cotação do dólar: ");
                cotacaoHoje = scanner.nextDouble();
                if(cotacaoHoje > 0){break;}
                System.out.println("\n\tERRO! O valor deve ser maior que zero!");
            }catch (InputMismatchException e){
                System.out.println("\n\tERRO! O valor deve ser numérico! ");
                scanner.nextLine();
            }
        }

        System.out.printf("\n\n%-10s %-10s", "VALOR(USD)", "VALOR(R$)\n");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacaoHoje*(i+1);
            System.out.printf("$%-10d R$%-10.3f\n", (i+1), vetorA[i]);
        }
        scanner.close();
    }
}
