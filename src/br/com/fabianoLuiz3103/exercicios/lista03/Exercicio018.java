package br.com.fabianoLuiz3103.exercicios.lista03;

/**
 * @author FabianoLuiz3103
 * --> Lista de fatorial de n >= 16
 */
public class Exercicio018 {

    public static void main(String[] args) {
        long fatorial = 1;
        for(int i = 0; i <= 16; i++){
            for(int j = i; j > 0; j--){
                fatorial = fatorial*j;
            }
            System.out.println(i + "!: " + fatorial);
            fatorial=1;
        }
    }
}
