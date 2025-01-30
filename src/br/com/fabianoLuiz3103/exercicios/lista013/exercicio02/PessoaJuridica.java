package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {

        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return (super.getRendaBruta()*0.1);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}' + super.toString();
    }
}
