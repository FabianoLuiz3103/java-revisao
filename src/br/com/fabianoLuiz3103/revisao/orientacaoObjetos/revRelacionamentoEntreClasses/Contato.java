package br.com.fabianoLuiz3103.revisao.orientacaoObjetos.revRelacionamentoEntreClasses;

public class Contato {

    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefons(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
