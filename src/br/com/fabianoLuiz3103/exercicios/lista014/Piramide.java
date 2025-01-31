package br.com.fabianoLuiz3103.exercicios.lista014;

public class Piramide extends Figura3D{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPolig;
    private Figura2D base;

    public Piramide(String nome, String cor, double altura, double arestaBase, double apotema, int numPolig, Figura2D base) {
        super(nome, cor);
        this.altura = altura;
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.numPolig = numPolig;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPolig() {
        return numPolig;
    }

    public void setNumPolig(int numPolig) {
        this.numPolig = numPolig;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if(base!=null){
            return (this.numPolig * ((this.arestaBase*this.apotema)/2))+this.base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
       if(this.base != null){
           return (this.base.calcularArea()*this.altura)/3;
       }
       return 0;
    }
}
