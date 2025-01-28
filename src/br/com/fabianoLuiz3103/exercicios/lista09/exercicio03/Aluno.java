package br.com.fabianoLuiz3103.exercicios.lista09.exercicio03;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private  String[] disciplinas;
    private double[][] notas;

    Aluno(){
        this.disciplinas = new String[3];
        this.notas = new double[this.disciplinas.length][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplina, int i) {
        this.disciplinas[i] = disciplina;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double nota, int i, int j) {
        this.notas[i][j] = nota;
    }

    private double obterMedia(int indice){
        double soma  = 0;
        for(int i = 0; i < this.notas[indice].length; i++){
            soma+=this.notas[indice][i];
        }
        return soma/this.notas[0].length;
    }

    public String verificarAprovacao(int indice){
       double media = this.obterMedia(indice);
       return "\n"+((media>=7)?" APROVADO EM: " + this.disciplinas[indice]  + " MÉDIA " + media
               :
               " REPROVADO EM: " + this.disciplinas[indice] + " MÉDIA " + media);
    }

    public void exbirInfo(){
        for(int i = 0; i < this.notas.length; i++){
            System.out.println("\n\nDISCIPLINA: " + this.disciplinas[i]);
            System.out.print("\nNOTAS: ");
            for(int j = 0; j < this.notas[i].length; j++){
                System.out.print(this.notas[i][j] + ", ");
            }
        }
    }
}
