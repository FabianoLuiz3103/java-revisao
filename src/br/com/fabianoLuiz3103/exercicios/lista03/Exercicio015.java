package br.com.fabianoLuiz3103.exercicios.lista03;

/**
 * @author FabianoLuiz3103
 * --> Fibonacci que vai até 500
 */
public class Exercicio015 {

    public static void main(String[] args) {

        int a = 0, b = 1, fibonacci=0, i = 0;

        while (fibonacci <= 500){

            if(i==0){fibonacci=0;}else
            if(i==1){fibonacci=1;}else{
                fibonacci=a+b;
                a = b;
                b = fibonacci;
            }
            System.out.print(fibonacci + ", ");
            i++;
        }
    }
}
