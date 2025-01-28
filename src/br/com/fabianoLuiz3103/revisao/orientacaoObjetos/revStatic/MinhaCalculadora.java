package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revStatic;

/**
 * modificador STATIC:
 * Não precisa de uma instância de classe para acessar um
 * método ou variável
 * --> Classes assim são chamadas de classes utilitárias
 * --------------------------
 * ex sem static:
 * MinhaCalculadora mc = new MinhaCalculadora();
 * mc.soma()
 * ---------------------------
 * ex com static:
 * MinhaCalculadora.soma()
 */
public class MinhaCalculadora {

    public static int soma(int num1, int num2){
        return num1+num2;
    }

    //Um parâmetro com tipo diferente
    public static int soma(int num1, double num2){
        return num1+(int)num2;
    }

    //A ordem está diferente, agora num1 é double
    public static int soma(double num1, int num2){
        return (int)num1+num2;
    }

    //Dois parâmetros diferente
    public static double soma(double num1, double num2){
        return num1+num2;
    }

    //Aumentando quantidade de parâmetros
    public static int soma(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
