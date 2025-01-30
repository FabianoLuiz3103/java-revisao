package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.classeObject;

import br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revPalavraFinal.Pessoa;

import java.util.Arrays;
import java.util.Objects;

/**
 * super funciona como o this, mas só vai mostrar os
 * atributos da superclass
 */
public class Aluno {


    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){return 0.0;}

    public boolean verificarAprovado(){return true;}

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    //Eu posso customizar, faznedo comparar só o nome do curso por exemplo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //--> verifica se é a mesma referência
        if (o == null || getClass() != o.getClass()) return false; //-> Verifica se é nulo e o tipo da classe
        Aluno aluno = (Aluno) o; //--> Casting
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas); //compara os valores dos atributos
    }

}
