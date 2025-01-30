package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revPalavraFinal;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        final String NOME_ALUNO = "Fabiano";
        final String NOME_PROFESSOR = "Rodrigo";

        aluno.setNome(NOME_ALUNO);
        professor.setNome(NOME_PROFESSOR);

        //NOME_PROFESSOR = NOME_ALUNO; --> Não tem como!

    }
}
