package br.com.fabianoLuiz3103.exercicios.lista011;

public class Exercicio02 {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("\nDE 1 A " + i + " = " + calcularSomatorio(i)+"\n");
        }
    }

    private static int calcularSomatorio(int num){
        if(num==1){
            return num;
        }
        return num+calcularSomatorio(num-1);
    }
}
