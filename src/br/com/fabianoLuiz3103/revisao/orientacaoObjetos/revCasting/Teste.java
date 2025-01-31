package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revCasting;

/**
 * Upcasting: um objeto de subcalasse é tratado como objeto superclasse -> Não precisa de conversão explicita
 * Downcasting: um objeto de superclase é convertido para um objeto de subclasse
 * precisa de conversão explicita (subclasse) -> pode dar exception
 */
public class Teste {

    public static void main(String[] args) {

        /*
         * Pessoa aluno = new Aluno()
         * é o mesmo que:
         * Pessoa aluno = (Pessoa) new Aluno();
         */
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting

        /*
        O código abaixo da erro porque Aluno tem atributos
        que pessoa não tem

        Pessoa aluno2 = new Pessoa();
        Aluno aluno3 = (Aluno) aluno2; //downcasting
         */
        Pessoa pessoa = new Pessoa();
        Pessoa aluno1 = new Aluno();
        Professor professor = new Professor();

        if(pessoa instanceof Pessoa){
            System.out.println("É do tipo pessoa");
        }
        if(aluno1 instanceof Aluno){
            System.out.println("É do tipo aluno");
        }
        if(professor instanceof Professor){
            System.out.println("É do tipo professor");
        }

    }
}
