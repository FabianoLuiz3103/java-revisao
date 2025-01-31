package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revInterfaces;

public abstract class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String emitirSom();
}
