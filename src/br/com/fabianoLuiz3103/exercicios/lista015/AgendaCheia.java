package br.com.fabianoLuiz3103.exercicios.lista015;

public class AgendaCheia extends Exception{

    private final int maxContatos;

    public AgendaCheia(int maxContatos) {
        super();
        this.maxContatos = maxContatos;
    }

    @Override
    public String getMessage() {
        return "A agenda já atingiu o limite de " + maxContatos + " contatos! ";
    }

}
