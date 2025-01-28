package br.com.fabianoLuiz3103.exercicios.lista010.exercicio02;

/**
 * @author FabianoLuiz3103
 */
public class Calculadora {

    public static int somar(int i, int j){
        return i+j;
    }


    public static int subtrair(int i, int j){
        return i-j;
    }
    public static int multiplicar(int i, int j){
        return i*j;
    }

    public static double dividir(double i, double j){
        double resultado = i/j;
        if(Double.isInfinite(resultado)){
            System.out.println("\n\tERRO! Não é possível dividir por ZERO!");
            return 0;
        }
        return resultado;
    }

    public static int potencia(int i, int j){
        int resultado=1;
        for(int k = 1; k < j; k++){
            resultado*=i;
        }
        return resultado;
    }
}
