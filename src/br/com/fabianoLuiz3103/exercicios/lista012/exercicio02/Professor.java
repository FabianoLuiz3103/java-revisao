package br.com.fabianoLuiz3103.exercicios.lista012.exercicio02;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirInfo(){
        System.out.printf("\n" +
                "\nNOME: %s" +
                "\nDEPARTAMENTO: %s" +
                "\nE-MAIL: %s", this.nome, this.departamento, this.email);
    }

}
