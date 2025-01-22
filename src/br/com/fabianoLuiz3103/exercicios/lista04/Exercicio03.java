package br.com.fabianoLuiz3103.exercicios.lista04;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 15 elementos; vetor B com 15 elementos e B[i] = raiz de A[i]
 */
public class Exercicio03 {

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        Random random = new Random();
        int numeroSorteado;

        for(int i = 0; i < vetorA.length; i++){
            numeroSorteado = sortearNumeroDiferente(vetorA,i, random);
            vetorA[i] = numeroSorteado;
            vetorB[i] = Math.sqrt(numeroSorteado);
            System.out.println("A[" + i + "]: " + vetorA[i] + " -|- B[" + i + "]: " + formatar(vetorB[i]));

        }
    }

    private static int sortearNumeroDiferente(int[] vetor, int indice, Random random){
     boolean repetido = true;
     int numeroSorteado = 0;
     while (repetido){
         numeroSorteado = random.nextInt(30)+1;
         repetido = false;
         for(int i = 0; i < indice; i++){
             if(vetor[i]==numeroSorteado){
                 repetido = true;
                 break;
             }
         }
     }
     return numeroSorteado;
    }

    private static String formatar(double valor){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(valor);
    }
}
