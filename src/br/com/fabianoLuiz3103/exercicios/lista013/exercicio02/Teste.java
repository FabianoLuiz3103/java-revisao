package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoaJuridica1 = new PessoaJuridica("Fabiano Luiz", "53824452276");
        fazerCalculoIR(pessoaJuridica1, 35000, pessoaJuridica1.getNome());
        Pessoa pessoaJuridica2 = new PessoaJuridica("Yolanda B.", "53824452111");
        fazerCalculoIR(pessoaJuridica2, 1000, pessoaJuridica2.getNome());
        Pessoa pessoaJuridica3 = new PessoaJuridica("Carlos E.", "11824452288");
        fazerCalculoIR(pessoaJuridica3, 15000, pessoaJuridica3.getNome());
    }

    private static void fazerCalculoIR(Pessoa pessoa, double rendaBruta, String nome){
        System.out.println("\n\t" + nome + " sua renda bruta é de R$" + rendaBruta + " e você tem que pagar R$" + pessoa.calcularImposto(rendaBruta)+" de imposto de renda!");

    }
}
