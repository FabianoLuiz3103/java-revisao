package br.com.fabianoLuiz3103.exercicios.lista013.exercicio03;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, comprimento, "cinzenta", "mar", velocidade);
        this.caracteristicas = "Barbatanas e caudas";
        super.setNumPatas(0);
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCaracteristicas: " + caracteristicas;
    }
}
