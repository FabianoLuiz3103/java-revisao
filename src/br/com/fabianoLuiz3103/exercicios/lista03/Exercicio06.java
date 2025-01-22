package br.com.fabianoLuiz3103.exercicios.lista03;

/**
 * @author FabianoLuiz3103
 * --> Programa que exibe os números de 1 a 20 um abaixo do outro e lado a lado
 */
public class Exercicio06 {

    public static void main(String[] args) {

        System.out.println("\n-----------------------------------------------" +
                "\n\tNA VERTICAL:");
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }
        System.out.println("\n-----------------------------------------------" +
                "\n\tNA HORIZONTAL:");
        for(int i = 1; i <= 20; i++){
            System.out.print(i + ", ");
        }
    }
}
