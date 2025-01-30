package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class PessoaFisica extends Pessoa{

    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularImposto(double rendaBruta) {
        double valor;
        if(rendaBruta >= 0 && rendaBruta <= 1400){
            valor = 0;
        }else if(rendaBruta > 1400 && rendaBruta <= 2100){
            valor = (rendaBruta*0.1)-100;
        }else if(rendaBruta > 2100 && rendaBruta < 2800){
            valor = (rendaBruta*0.15)-270;
        }else if(rendaBruta > 2800 && rendaBruta < 3600){
            valor = (rendaBruta*0.25)-500;
        }else {
            valor = (rendaBruta*0.3)-700;
        }
        return valor;
    }
}
