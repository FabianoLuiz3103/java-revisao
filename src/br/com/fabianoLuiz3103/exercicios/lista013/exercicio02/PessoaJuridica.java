package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class PessoaJuridica extends Pessoa{


    public PessoaJuridica(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularImposto(double rendaBruta) {
        if(rendaBruta>0){
            return rendaBruta*0.10;
        }
        return 0;
    }

}
