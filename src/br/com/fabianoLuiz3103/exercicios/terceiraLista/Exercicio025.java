package br.com.fabianoLuiz3103.exercicios.terceiraLista;

/**
 * @author FabianoLuiz3103
 * --> Programa que cria uma tabela de preços para uma loja de 1,99
 * Preço de 1 produto até 50 produtos
 */
public class Exercicio025 {

    public static void main(String[] args) {

        int i = 1, totalProdutos = 50;

        System.out.println("\n----------------------------------------------------------" +
                "\nLOJAS QUASE DOIS - TABELA DE PREÇOS: ");
        while(i <= totalProdutos){
            System.out.println(i + " - R$ " + (i*1.99));
            i++;
        }
    }
}
