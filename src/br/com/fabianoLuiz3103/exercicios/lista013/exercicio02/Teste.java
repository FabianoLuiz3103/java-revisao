package br.com.fabianoLuiz3103.exercicios.lista013.exercicio02;

public class Teste {

    public static void main(String[] args) {

        System.out.println("\n\t\t ******** PESSOA JURÍDICA ********");
        Pessoa pessoaJuridica1 = new PessoaJuridica("Fabiano Luiz", 35000, "538244522760001");
        Pessoa pessoaJuridica2 = new PessoaJuridica("Yolanda B.", 1000, "538244521110001");
        Pessoa pessoaJuridica3 = new PessoaJuridica("Carlos E.",15000, "118244522880001");
        fazerCalculoIR(pessoaJuridica1);
        fazerCalculoIR(pessoaJuridica2);
        fazerCalculoIR(pessoaJuridica3);

        System.out.println("\n\n\t\t ******** PESSOA FÍSICA ********");
        // --> Pessoa física
        Pessoa pessoaFisica1 = new PessoaFisica("Ricardo O.", 1400, "11122233344400");
        Pessoa pessoaFisica2 = new PessoaFisica("José Baptista S.",1500, "11122233399900");
        Pessoa pessoaFisica3 = new PessoaFisica("Marcos A.",4000, "11122266744400");
        fazerCalculoIR(pessoaFisica1);
        fazerCalculoIR(pessoaFisica2);
        fazerCalculoIR(pessoaFisica3);



    }

    private static void fazerCalculoIR(Pessoa pessoa){
        System.out.println("\n\t" + pessoa.getNome() + " sua renda bruta é de R$" + pessoa.getRendaBruta() + " e você tem que pagar R$" + pessoa.calcularImposto()+" de imposto de renda!");
        System.out.println(pessoa.toString());

    }
}
