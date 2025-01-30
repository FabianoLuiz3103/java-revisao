package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revClasseAbstrata;

/**
 * super funciona como o this, mas só vai mostrar os
 * atributos da superclass
 */
public class Aluno extends Pessoa {


    private String curso;
    private String[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone); //acesso à superclasse
        //construtor da classe Pessoa -> mãe
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){return 0.0;}

    public boolean verificarAprovado(){return true;}

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        return s+=super.obterEtiquetaEndereco();
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
