package br.com.fabianoLuiz3103.exercicios.terceiraLista;

/**
 * @author FabianoLuiz3103
 * --> Programa que exibe os números ímpares entre 1 e 50
 */
public class Exercicio09 {

    public static void main(String[] args) {

        System.out.print("\n------------------------------------------------------------------------------------------------------------------" +
                "\nÍmpares entre 1 e 50: ");
        for(int i = 0; i <= 50; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
}
