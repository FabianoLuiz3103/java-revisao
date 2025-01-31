package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revInterfaces;

public class Gato extends Mamifero{

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    @Override
    public String amamentar() {
        return null;
    }
}
