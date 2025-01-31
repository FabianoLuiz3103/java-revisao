package br.com.fabianoLuiz3103.exercicios.lista014;

public class Quadrado extends Figura2D{

    private double lado;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado,2);
    }
}
