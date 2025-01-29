package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revHeranca;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Fabiano");

        Professor professor = new Professor();
        professor.setNome("Rodrigo");

        System.out.println(aluno.getNome());
        System.out.println(professor.getNome());
    }

}
