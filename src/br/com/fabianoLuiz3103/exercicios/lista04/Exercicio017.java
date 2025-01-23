package br.com.fabianoLuiz3103.exercicios.lista04;

/**
 * @author FabianoLuiz3103
 * --> Programa que verifica se um vetor de 10 elementos é palíndrome
 */
public class Exercicio017 {

    public static void main(String[] args) {

        int[] numeros = {0, 0, 2, 2, 9, 9, 2,2, 0, 0};
        boolean isPalindrome = true;

        for (int i = 0; i < (numeros.length/2); i++) {
            if(numeros[i]!=numeros[numeros.length-1-i]){
                isPalindrome = false;
                break;
            }
        }
        System.out.print("\nO Vetor: ");
        for (int n : numeros) {
            System.out.print(n + ", ");
        }
        System.out.print((isPalindrome) ? " É palíndrome!! " : " Não é palíndrome!! ");
    }
}
