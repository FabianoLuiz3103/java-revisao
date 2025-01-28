package br.com.fabianoLuiz3103.exercicios.lista010.exercicio02;

public class TesteCalculadora {

    public static void main(String[] args) {

        imprimir(Calculadora.somar(2,5));
        imprimir(Calculadora.subtrair(2,5));
        imprimir(Calculadora.multiplicar(2,5));
        System.out.print("\nRESULTADO: " + Calculadora.dividir(2,5)+"\n");
        imprimir(Calculadora.potencia(2,5));
        imprimir(Calculadora.fatorial(3));
    }
    //numero inteiro
    private static void imprimir(int numero){
        System.out.println("\nRESULTADO: " + numero);
    }
}
