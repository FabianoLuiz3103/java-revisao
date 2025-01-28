package br.com.fabianoLuiz3103.exercicios.lista011;

/**
 * @author FabianoLuiz3103
 * --> Fibonnaci
 */
public class Exercicio01 {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.print(calcularFibonacci(i) + ", ");
        }
    }

    private static int calcularFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return calcularFibonacci(n-1)+calcularFibonacci(n-2);
    }
}
