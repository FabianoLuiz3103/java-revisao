package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.classeObject;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10,9,8,7};
        aluno.setNotas(notas);

        System.out.println(aluno.toString());

        /**
         * Aluno@6acbcfc0 --> Referência da memória onde estão os valores do objeto
         *
         *  == -> para comparar o objeto faz comparar só a referência
         *  não os valores, para isso tem que usar o equals
         */

        Aluno aluno2 = new Aluno();

        aluno.setCurso("SI");
        double[] notas2 = {9,5,8,7};
        aluno.setNotas(notas2);

        //System.out.println(aluno==aluno2); --> comparando referências

        System.out.println(aluno.equals(aluno2)); //--> Comparando os valores
        //Ciência da Computação é != de SI
    }
}
