package br.com.fabianoLuiz3103.exercicios.lista014;

public class Circulo extends Figura2D{

    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.raio,2);
    }
}
