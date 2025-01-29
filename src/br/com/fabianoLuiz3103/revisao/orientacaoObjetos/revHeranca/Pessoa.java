package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revHeranca;

/**
 * Vai ter os atributos que são comuns entre as classes
 * filhas. Aluno e Professor repetem os atributos:
 * nome, endereco, telefone e cpf
 * Agora a classe Aluno e Professor só tem os atributos específicos
 * e herdam os atributos da classe professor
 * --> RELACIONAMENTO "É UM" --> Só fazer herança nesse caso
 * ALUNO É UMA PESSOA
 * PROFESSOR É UMA PESSOA
 */
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    protected String nomeVisibilidade;


    public Pessoa(){}

    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
