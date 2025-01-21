package br.com.fabianoLuiz3103.exercicios.terceiraLista;

/**
 * @author FabianoLuiz3103
 */
public class Exercicio036 {

    public static void main(String[] args) {

        double soma = 0;
        System.out.print("S = ");
        int j = 1;
        for(int i = 1; i <= 100; i++){
                    System.out.print(i +"/" + j + " + ");
                    soma+=((double) i /j);
                    j+=2;
        }
        System.out.print("\n\nSOMA: "+ soma);
    }
}
