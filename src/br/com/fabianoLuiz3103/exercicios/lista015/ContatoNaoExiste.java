package br.com.fabianoLuiz3103.exercicios.lista015;

public class ContatoNaoExiste extends Exception{

    private final int indice;

    public ContatoNaoExiste(int indice){
        super();
        this.indice = indice;
    }

    @Override
    public String getMessage() {
        return "O contato com indice: " + indice + " não existe! ";
    }

}
