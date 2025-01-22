package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Receber 10 idades e informar qual é a maior e qual é a menor;
 * Usando Bubble Sort -> Complexidade 0(n^2) -> Pouco eficiente
 */
public class Exercicio012_2 {

    public static void main(String[] args) {

        int[] idades = new int[10];
        Random random = new Random();

        for(int i = 0; i < idades.length; i++){
            idades[i] = random.nextInt(50)+1;
        }
        System.out.print("\n----------------------------------------------" +
                "\nENTRE AS IDADES: ");
        for(int i: idades){
            System.out.print(i + ", ");
        }
        ordenarVetor(idades);
        System.out.println("\nA MENOR É: " + idades[0]+
                "\nA MAIOR É: " + idades[idades.length-1]);

    }
    private static void ordenarVetor(int[] vetor){
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length-1; j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
       }
    }
}
