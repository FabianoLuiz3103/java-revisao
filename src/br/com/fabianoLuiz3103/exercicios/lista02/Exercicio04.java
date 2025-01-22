package br.com.fabianoLuiz3103.exercicios.lista02;

import java.util.Scanner;
import java.util.Set;

/**
 * @author FabianoLuiz3103
 * --> Faça um programa que receba uma letra e verifique se ela é vogal ou consoante
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String letraInformada;
        char caractere;
        Set<Character> vogais = Set.of('A', 'E', 'I', 'O', 'U');

        while (true){
            System.out.println("\nInforme uma letra:");
            letraInformada = scanner.next().toUpperCase();
            if(letraInformada.length() != 1){
                System.out.println("ATENÇÃO! Deve ser informado somente uma letra!");
                continue;
            }
            caractere = letraInformada.charAt(0);
            if(Character.isLetter(caractere)){
                break;
            } else {
                System.out.println("ATENÇÃO! Deve ser informado somente letra do ALFABETO!");
            }
        }

            if(vogais.contains(caractere)){
                System.out.println(caractere + " É VOGAL! ");
            }else {
                System.out.println(caractere + " É CONSOANTE! ");
            }


    }
}
