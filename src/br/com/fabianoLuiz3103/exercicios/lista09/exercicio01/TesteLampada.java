package br.com.fabianoLuiz3103.exercicios.lista09.exercicio01;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada(
                "OuroLux",
                "Branca",
                12,
                127
        );

        System.out.println("A lampâda está: " + lampada.mostrarEstado());
        lampada.mudarEstado();
        System.out.println("A lampâda está: " + lampada.mostrarEstado());

        //desligar
        lampada.mudarEstado();
        System.out.println("A lampâda está: " + lampada.mostrarEstado());

    }
}
