package br.com.fabianoLuiz3103.exercicios.lista07.exercicio02;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro01 = new Livro();
        livro01.titulo = "A culpa é das estrelas";
        livro01.genero = "Drama";
        livro01.qtdPaginas = 314;
        livro01.autor = "John Green";

        System.out.println(livro01.titulo);
    }
}
