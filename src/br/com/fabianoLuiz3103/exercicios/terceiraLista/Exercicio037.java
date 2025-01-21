package br.com.fabianoLuiz3103.exercicios.terceiraLista;

/**
 * @author FabianoLuiz3103
 */
public class Exercicio037 {

    public static void main(String[] args) {

        double soma = 0;
        System.out.print("H = ");
        for(int i = 1; i <= 100; i++){
            System.out.print(1 + "/" + i + " + ");
            soma = (double)1/i;
        }
        System.out.println("\nSOMA = " + soma);
    }
}
