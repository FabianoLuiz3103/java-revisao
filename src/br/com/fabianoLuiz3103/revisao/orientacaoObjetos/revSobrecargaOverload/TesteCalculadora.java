package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revSobrecargaOverload;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calculadora = new MinhaCalculadora();

        calculadora.soma(0.2, 1);
        calculadora.soma(1, 0.5);
        calculadora.soma(1, 3);
    }
}
