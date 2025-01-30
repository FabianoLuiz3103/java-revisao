package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revClasseAbstrata;

public class Teste {

    public static void main(String[] args) {

        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua 2, nº 4");
        professor.setEndereco("Rua 3, nº 8");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());


    }
}
