package br.com.fabianoLuiz3103.exercicios.lista04;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Receber 10 idades e informar qual é a maior e qual é a menor;
 * Complexidade O(n) -> Mais eficiente
 */
public class Exercicio012 {

    public static void main(String[] args) {

        int[] idades = new int[10];
        Random random = new Random();
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for(int i = 0; i < idades.length; i++){
            idades[i] = random.nextInt(50)+1;
            if(idades[i] > maior){
                maior = idades[i];
            }
            if(idades[i] < menor){
                menor = idades[i];
            }
        }
        System.out.print("\n----------------------------------------------" +
                "\nENTRE AS IDADES: ");
        for(int i: idades){
            System.out.print(i + ", ");
        }

        System.out.println("\nA MENOR É: " + menor+
                "\nA MAIOR É: " + maior);
    }
}
