package br.com.fabianoLuiz3103.revisao.revVariaveis;

public class Variaveis {

    public static void main(String[] args) {

        //Declarações seguindo as boas práticas
        int idade = 20;
        String nome = "Fulano";
        String nomeDoMeuGato = "Gatinho";

        //É aceito, mas não é utilizado
        int _idade;
        int $idade;

        //Não é uma conveção do JAVA
        String nome_do_meu_gato;
        String NomeDoMeuGato;

        //Mudando o valor da atribuição
        idade = 30;

        //Exibindo os valores
        System.out.println(nome + " tem " + idade + " anos e seu gato se chama " + nomeDoMeuGato);

        //Má prática - nome de variáveis sem significância
        int a = 10;
        String b = "Fulano";

    }
}
