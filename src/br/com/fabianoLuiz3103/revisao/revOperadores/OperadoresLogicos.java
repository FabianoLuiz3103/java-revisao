package br.com.fabianoLuiz3103.revisao.revOperadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int valorUm = 1;
        int valorDois = 2;

        boolean resultadoUm = (valorUm == 1) && (valorDois == 2);
        System.out.println("ValorUm é 1 AND valorDois é 2 - resultado: " + resultadoUm);

        boolean resultadoDois = (valorUm != 1) && (valorDois == 2);
        System.out.println("ValorUm não é 1 AND valorDois é 2 - resultado: " + resultadoDois);

        boolean resultadoTres = (valorUm != 1) || (valorDois == 2);
        System.out.println("ValorUm não é 1 OR valorDois é 2 - resultado: " + resultadoTres);

        boolean resultadoQuatro = (valorUm == 1) ^ (valorDois == 2);
        System.out.println("ValorUm é 1 XOR valorDois é 2 - resultado: " + resultadoQuatro);

        boolean resultadoCinco = (valorUm != 1) ^ (valorDois == 2);
        System.out.println("ValorUm não é 1 XOR valorDois é 2 - resultado: " + resultadoCinco);
    }
}
