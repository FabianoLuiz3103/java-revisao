package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revSobrecargaOverload;

/**
 * SOBRECARGA:
 * --> Mais de um método com o mesmo nome, mas com a assinatura
 * diferente, ou seja, quantidade de parâmetros
 * tipo dos parâmetros e a ordem também conta
 */
public class MinhaCalculadora {

    public int soma(int num1, int num2){
        return num1+num2;
    }

    //Um parâmetro com tipo diferente
    public int soma(int num1, double num2){
        return num1+(int)num2;
    }

    //A ordem está diferente, agora num1 é double
    public int soma(double num1, int num2){
        return (int)num1+num2;
    }

    //Dois parâmetros diferente
    public double soma(double num1, double num2){
        return num1+num2;
    }

    //Aumentando quantidade de parâmetros
    public int soma(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
