package br.com.fabianoLuiz3103.exercicios.lista05;

import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Gerar uma matriz 4x4 com números aleatórios de 0 a 9
 * --> Mostrar o maior número e sua posição
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[4][4];
        int maior = 0;
        String posicao = "";

        System.out.println("\nMatriz 4X4:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(100);

                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    posicao = "[" + i + "," + j + "]";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior número da matriz: " + maior + ", posição: " + posicao);
    }
}
