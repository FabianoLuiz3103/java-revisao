package br.com.fabianoLuiz3103.exercicios.lista07.exercicio01;

/**
 * @author FabianoLuiz
 */
public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada01 = new Lampada();
        lampada01.marca = "OuroLux";
        lampada01.tensao = 220;
        lampada01.potenciaM = 12;
        lampada01.preco = 18.50;

        System.out.println(lampada01.marca);
        System.out.println(lampada01.preco);
    }
}
