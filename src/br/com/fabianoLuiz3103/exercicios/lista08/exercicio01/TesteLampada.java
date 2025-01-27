package br.com.fabianoLuiz3103.exercicios.lista08.exercicio01;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.marca = "OuroLux";
        lampada.cor = "Branca";
        lampada.potencia = 12;
        lampada.tensao = 127;

        System.out.println("A lampâda está: " + ((lampada.ligada?"ligada":"desligada")));
        //ligar
        lampada.ligar();
        System.out.println("A lampâda está: " + ((lampada.ligada?"ligada":"desligada")));

        //desligar
        lampada.desligar();
        System.out.println("A lampâda está: " + ((lampada.ligada?"ligada":"desligada")));

    }
}
