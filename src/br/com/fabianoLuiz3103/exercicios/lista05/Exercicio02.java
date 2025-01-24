package br.com.fabianoLuiz3103.exercicios.lista05;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Matriz 10X10 com números aleatórios
 * --> Maior e menor da linha 5 e 7
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[10][10];
        String maiorL5,menorL5,maiorC7, menorC7;

        System.out.println("\nMATRIZ 10X10: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(200);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

                maiorL5 = maiorMenorL5(matriz[5], true);
                menorL5 = maiorMenorL5(matriz[5], false);
                maiorC7 = maiorMenorC7(matriz, true);
                menorC7 = maiorMenorC7(matriz, false);

        System.out.println("\n" +
                "\nMaior L5: " + maiorL5 +
                "\nMenor L5: " + menorL5+
                "\nMaior C7: " + maiorC7+
                "\nMenor C7: " + menorC7
        );
        
    }

    private static String maiorMenorL5(int[] l5, boolean isMaior){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int pMaior=0, pMenor=0;

        for(int i = 0; i<l5.length; i++){
            if(l5[i] > maior){
                maior = l5[i];
                pMaior = i;
            } if(l5[i] < menor){
                menor = l5[i];
                pMenor = i;
            }
        }
        return isMaior ? maior + " [5, " + pMaior + "]" : menor + " [5, " + pMenor + "]";
    }

    private static String maiorMenorC7(int[][] matriz, boolean isMaior){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int pMaior = 0, pMenor = 0;
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][7] > maior){
                maior = matriz[i][7];
                pMaior = i;
            } if(matriz[i][7] < menor){
                menor = matriz[i][7];
                pMenor = i;
            }
        }
        return isMaior ? maior + " [" + pMaior + ", 7]" : menor + " [" + pMenor + ", 7]";

    }
}
