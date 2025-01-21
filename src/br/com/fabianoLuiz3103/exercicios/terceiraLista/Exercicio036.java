package br.com.fabianoLuiz3103.exercicios.terceiraLista;

/**
 * @author FabianoLuiz3103
 */
public class Exercicio036 {

    public static void main(String[] args) {

        double soma = 0;
        System.out.print("S = ");

        for(int i = 1, j = 1; i <= 100; i++, j+=2){
                    System.out.print(i +"/" + j + " + ");
                    soma+=((double) i /j);
        }
        System.out.print("\n\nSOMA: "+ soma);
    }
}
