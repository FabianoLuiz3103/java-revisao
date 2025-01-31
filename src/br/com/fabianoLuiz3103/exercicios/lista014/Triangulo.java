package br.com.fabianoLuiz3103.exercicios.lista014;

public class Triangulo extends Figura2D{

    private double base;
    private double altura;

    public Triangulo(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (this.base*this.altura)/2;
    }
}
