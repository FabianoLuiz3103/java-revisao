package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 *--> Programa que soma elementos de um vetor menores que 15, conta a quantidade
 * de elementos iguais a 15 e calcula a média dos elementos maiores que 15
 */
public class Exercicio010 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int quantidadeQuinze=0,
                somaMenorQuinze=0,
                quantidadeMaiorQuize=0,
                somaMaiorQuinze = 0;
        Random random = new Random();

        System.out.print("\n\n-----------------------------------------------" +
                "\nNO VETOR: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(20)+1;
            System.out.print(vetorA[i] + ((i == vetorA.length-1) ? ". " : ", "));
            if(vetorA[i] < 15){
                somaMenorQuinze+=vetorA[i];
            }else if(vetorA[i] > 15){
                quantidadeMaiorQuize++;
                somaMaiorQuinze+=vetorA[i];
            }else{
                quantidadeQuinze++;
            }
        }

        System.out.println("\n------------------------------------------" +
                "\nA SOMA DE NÚMEROS MENORES QUE 15 É: " + somaMenorQuinze+
                "\nA QUANTIDADE DE NÚMEROS IGUAL A 15 É: " + quantidadeQuinze +
                "\nA MÉDIA DE NÚMEROS MAIORES QUE 15 É: " + (somaMaiorQuinze/(double)quantidadeMaiorQuize));
    }
}
