package br.com.fabianoLuiz3103.exercicios.lista01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FabianoLuiz3103
 * --> Programa que calcula a quantidade de tinta que precisa e o valor a ser pago
 * com base no tamanho em metros quadrados informado.
 */
public class Exercicio012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double areaMetrosQuadrados, valorGasto, litrosTinta;
        int latasTinta;

        while (true){
            try{
                System.out.println("Informe o tamanho da área a ser pintada: ");
                areaMetrosQuadrados = scanner.nextDouble();
                if(areaMetrosQuadrados <= 0){
                    System.out.println("\nO valor deve ser maior que zero! ");
                    continue;
                }
                break;
            }catch(InputMismatchException e){
                System.out.println("\nO valor deve ser do tipo numérico! ");
                scanner.nextLine();
            } finally {
                scanner.close();
            }
        }

        litrosTinta = areaMetrosQuadrados/3;
        latasTinta = (int) Math.ceil(litrosTinta/18);
        valorGasto = latasTinta * 80.0;

        System.out.println("\n----------------------------------------------------");
        System.out.printf("Para pintar uma área de: %.2fM²"
        + "%nvai ser necessário %.2f litros de tinta," +
                "%nou seja, %d latas, resultando em um custo de R$%.2f",
                areaMetrosQuadrados, litrosTinta, latasTinta, valorGasto);

    }
}
