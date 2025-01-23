package br.com.fabianoLuiz3103.exercicios.lista04;

/**
 * @author FabianoLuiz3103
 * --> Vetor A com 11 elementos -> A[i] = 2^i
 */
public class Exercicio029 {

    public static void main(String[] args) {

        int[] vetorA = new int[11];
        int potencia, base = 2;

        for(int i = 0; i < vetorA.length; i++){
            potencia=1;
            for(int j = 0; j < i; j++){
                potencia*=base;
            }
            vetorA[i] = potencia;
            System.out.println(retornarPotencia(base,i)+ ": " + vetorA[i]);
        }

    }

    private static String retornarPotencia(int base, int expoente) {
        return base+ switch (expoente) {
            case 0 -> "\u2070";
            case 1 -> "\u00B9";
            case 2 -> "\u00B2";
            case 3 -> "\u00B3";
            case 4 -> "\u2074";
            case 5 -> "\u2075";
            case 6 -> "\u2076";
            case 7 -> "\u2077";
            case 8 -> "\u2078";
            case 9 -> "\u2079";
            case 10 -> "\u00B9\u2070";
            default -> "Número fora do intervalo";
        };
    }

}
