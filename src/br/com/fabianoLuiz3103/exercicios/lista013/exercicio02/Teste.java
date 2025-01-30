package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class Teste {

    public static void main(String[] args) {

        System.out.println("\n\t\t ******** PESSOA JURÍDICA ********");
        Pessoa pessoaJuridica1 = new PessoaJuridica("Fabiano Luiz", "53824452276");
        Pessoa pessoaJuridica2 = new PessoaJuridica("Yolanda B.", "53824452111");
        Pessoa pessoaJuridica3 = new PessoaJuridica("Carlos E.", "11824452288");
        fazerCalculoIR(pessoaJuridica1, 35000, pessoaJuridica1.getNome());
        fazerCalculoIR(pessoaJuridica2, 1000, pessoaJuridica2.getNome());
        fazerCalculoIR(pessoaJuridica3, 15000, pessoaJuridica3.getNome());

        System.out.println("\n\n\t\t ******** PESSOA FÍSICA ********");
        // --> Pessoa física
        Pessoa pessoaFisica1 = new PessoaFisica("Ricardo O.", "11122233344400");
        Pessoa pessoaFisica2 = new PessoaFisica("José Baptista S.", "11122233399900");
        Pessoa pessoaFisica3 = new PessoaFisica("Marcos A.", "11122266744400");
        fazerCalculoIR(pessoaFisica1, 1400, pessoaFisica1.getNome());
        fazerCalculoIR(pessoaFisica2, 1500, pessoaFisica2.getNome());
        fazerCalculoIR(pessoaFisica3, 4000, pessoaFisica3.getNome());


    }

    private static void fazerCalculoIR(Pessoa pessoa, double rendaBruta, String nome){
        System.out.println("\n\t" + nome + " sua renda bruta é de R$" + rendaBruta + " e você tem que pagar R$" + pessoa.calcularImposto(rendaBruta)+" de imposto de renda!");

    }
}
