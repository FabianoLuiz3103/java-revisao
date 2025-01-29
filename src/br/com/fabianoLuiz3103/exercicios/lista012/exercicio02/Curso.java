package br.com.fabianoLuiz3103.exercicios.lista012.exercicio02;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void exibirInfo(){
       System.out.println("\n" +
               "\n >>> CURSO <<<" +
               "\nNOME: "+ this.nome+
               "\nHORÁRIO: " + this.horario+
               "\n\n >>> PROFESSOR <<<");
       if(this.professor!=null) {
           this.professor.exibirInfo();
       }
       System.out.println("\n>>> ALUNOS <<<");
       if(this.alunos!=null){
           for(Aluno a: this.alunos){
               a.exibirInfo();
           }
       }
    }
}
