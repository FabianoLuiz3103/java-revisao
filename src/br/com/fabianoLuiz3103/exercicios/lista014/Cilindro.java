package br.com.fabianoLuiz3103.exercicios.lista014;

public class Cilindro extends Figura3D{

    private double raio;
    private double altura;

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * Math.pow(this.raio,2);
        double areaLateral = 2*Math.PI*this.raio*altura;
        return (2*areaBase) + areaLateral;
    }

    @Override
    public double calcularVolume() {

        return Math.PI*Math.pow(this.raio,2)*this.altura;
    }
}
