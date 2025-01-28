package br.com.fabianoLuiz3103.revisao.revRecursividade;

/**
 * RECURSIVIDADE:
 * --> Método que chama ele mesmo
 * --> Precisa de um ponto de parada
 */
public class Fatorial {

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));

        //fatorial(5) = 5 * fatorial(4)
        //fatorial(4) = 4 * fatorial(3)
        //fatorial(3) = 3 * fatorial(2)
        //fatorial(2) = 2 * fatorial(1)
        //fatorial(2) = 2 * fatorial(1)
        //fatorial(1) = 1 * fatorial(0)
        //fatorial(0) = 1
    }

    public static int calcularFatorial(int n){
        if(n == 0){return 1;} //--> Ponto de parada
        return n * calcularFatorial(n-1);
    }
}
