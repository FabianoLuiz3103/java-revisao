package br.com.fabianoLuiz3103.exercicios.lista09.exercicio01;

public class Lampada {

    private String marca;
    private String cor;
    private int tensao;
    private int potencia;
    private boolean ligada;

    Lampada(){}

    Lampada(String marca, String cor, int tensao, int potencia) {
        this.marca = marca;
        this.cor = cor;
        this.tensao = tensao;
        this.potencia = potencia;
        this.ligada = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void mudarEstado(){
        if(this.isLigada()){
            this.desligar();
        }else{
            this.ligar();
        }
    }

    public String mostrarEstado(){
        return this.isLigada()?"ligada":"desligada";
    }

    private void ligar(){
        this.setLigada(true);
    }

    private void desligar(){
        this.setLigada(false);
    }
}
