package br.com.fabianoLuiz3103.exercicios.lista012.exercicio02;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    Aluno(){
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    private String resultado(double media){
        return media>=7 ? "APROVADO":"REPROVADO";
    }

    public void exibirInfo(){
        double soma = 0;
        System.out.printf("\n" +
                "\nNOME:%s" +
                "\nMATRÍCULA: %s\n", this.nome, this.matricula);
        System.out.print("\nNOTAS: ");
        for(double n: this.notas){
            System.out.print(n + ", ");
            soma+=n;
        }
        double m = soma/this.notas.length;
        System.out.printf("\nMÉDIA: %.2f ---> RESULTADO: %s", m, resultado(m));
    }
}