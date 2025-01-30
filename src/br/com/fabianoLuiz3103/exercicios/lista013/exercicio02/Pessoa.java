package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private double rendaBruta;

    Pessoa(){}
    public Pessoa(String nome, String cpf, double rendaBruta) {
        this.nome = nome;
        this.cpf = cpf;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rendaBruta=" + rendaBruta +
                '}';
    }
}
