package br.com.fabianoLuiz3103.exercicios.lista010.exercicio01;

public class TesteContador {

    public static void main(String[] args) {

        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();

    }

    private static void imprimirValor(){
        System.out.println(Contador.obeterValor());
    }
}
